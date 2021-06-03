package org.mariuszadara.strongpassword.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordGenerator;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;

public class StrongPasswordGeneratorImpl implements StrongPasswordGenerator, StrongPasswordOperationsManager {

	private static final int CAPACITY = 10;
	
	private int passwordLength;
	private int maxResults;
	private int maxRunningTime;

	private List<String> availableLists = new ArrayList<>(4);
	private final Random random = new Random(System.nanoTime());
	private int prevListIndex = -1;

	private List<String> entriesToValidate = new ArrayList<>();
	private List<String> validatedEntries = new ArrayList<>();

	private long startTime;

	private ReentrantLock lock = new ReentrantLock(true);

	@Override
	public boolean acquireSession() {
		try {
			return lock.tryLock(5, TimeUnit.MILLISECONDS);
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
	}

	@Override
	public void releaseSession() {
		lock.unlock();
	}

	@Override
	public synchronized boolean done() {
		return Thread.currentThread().isInterrupted() || validatedEntries.size() >= maxResults || System.currentTimeMillis() - startTime >= maxRunningTime;
	}

	@Override
	public boolean hasCandidates() {
		return !entriesToValidate.isEmpty();
	}

	@Override
	public List<String> peekCandidates(int count) {
		if (entriesToValidate.isEmpty()) {
			return Collections.emptyList();
		}
		var entries = new ArrayList<>(entriesToValidate.subList(0, Math.min(entriesToValidate.size(), count)));
		entriesToValidate.removeAll(entries);
		return entries;
	}
	
	@Override
	public void submitValidCandidates(List<String> candidates) {
		validatedEntries.addAll(candidates);
	}

	@Override
	public List<String> generatePasswords(StrongPasswordOptions options) {

		options.validate();
		
		init(options);
		var validatorThreads = spawnValidatorThreads(options);
		
		startTime = System.currentTimeMillis();
		try {
			validatorThreads.forEach(Thread::start);
			while (!done()) {
				var occupancy = entriesToValidate.size();
				if (occupancy < CAPACITY && acquireSession(true)) {
					try {
						entriesToValidate.addAll(generateCandidates(CAPACITY - occupancy));
					}
					finally {
						releaseSession();
					}
				}
				Thread.sleep(3);
			}
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new StrongPasswordException(StrongPasswordException.GENERATOR_INTERRUPTED, "The generator has been interrupted", e);
		}
		finally {
			validatorThreads.forEach(Thread::interrupt);
		}

		if (validatedEntries.size() > maxResults) {
			validatedEntries = validatedEntries.subList(0, maxResults);
		}

		while (validatedEntries.size() > maxResults) {
			validatedEntries.remove(validatedEntries.size() - 1);
		}
		
		return validatedEntries;
	}

	private List<Thread> spawnValidatorThreads(StrongPasswordOptions options) {
		return IntStream.range(0, options.getThreadsCount())
				.mapToObj(index -> new StrongPasswordValidatorThread("strong-password-validator-" + index, options, this))
				.collect(Collectors.toList());

	}
	
	private void init(StrongPasswordOptions options) {

		passwordLength = options.getLength();
		maxResults = options.getMaxResultsCount();
		maxRunningTime = options.getMaxRunningTime();

		if (options.shouldUseSymbols()) {
			availableLists.add(options.getSymbols());
		}

		if (options.shouldUseNumbers()) {
			availableLists.add(options.getNumbers());
		}

		if (options.shouldUseLowercaseCharacters()) {
			availableLists.add(options.getLowercaseCharacters());
		}

		if (options.shouldUseUppercaseCharacters()) {
			availableLists.add(options.getUppercaseCharacters());
		}
	}
	
	private List<String> generateCandidates(int count) {
		return IntStream.range(0, count).mapToObj(x -> generateCandidate()).collect(Collectors.toList());
	}
	
	private String generateCandidate() {

		var candidate = new char[passwordLength];

		for (var i = 0; i < passwordLength; i++) {

			int listIndex;
			do {
				listIndex = random.nextInt(availableLists.size());
			}
			while (listIndex == prevListIndex);
			prevListIndex = listIndex;

			var targetList = availableLists.get(listIndex);
			var entryIndex = random.nextInt(targetList.length());

			candidate[i] = targetList.charAt(entryIndex);
		}

		return new String(candidate);
	}
}
