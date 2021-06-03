package org.mariuszadara.strongpassword.internal;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.mariuszadara.strongpassword.api.StrongPasswordOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordValidator;
import org.mariuszadara.strongpassword.api.StrongPasswordValidatorFactory;

class StrongPasswordValidatorThread extends Thread {

	private static final int REQUEST_DELAY = 3;
	private static final int PROCESSING_POWER = 3;

	private StrongPasswordOperationsManager manager;
	private StrongPasswordOptions options;
	private StrongPasswordValidator validator = StrongPasswordValidatorFactory.make();

	public StrongPasswordValidatorThread(String name, StrongPasswordOptions options, StrongPasswordOperationsManager manager) {
		super(name);
		this.options = options;
		this.manager = manager;
	}

	@Override
	public void run() {

		try {
			while (!Thread.currentThread().isInterrupted() && !manager.done()) {

				Thread.sleep(REQUEST_DELAY);

				if (manager.acquireSession()) {

					var candidates = extractCandidates();
	
					if (!candidates.isEmpty()) {
						var validCandidates = validateCandidates(candidates);		
						submitValidCandidates(validCandidates);
					}
				}
			}
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private List<String> extractCandidates() {

		try {
			if (manager.hasCandidates()) {
				return manager.peekCandidates(PROCESSING_POWER);
			}
			else {
				return Collections.emptyList();
			}
		}
		finally {
			manager.releaseSession();
		}
	}

	private List<String> validateCandidates(List<String> candidates) {
		return candidates.stream()
						 .filter(candidate -> validator.isValid(options, candidate))
						 .collect(Collectors.toList());
	}

	private void submitValidCandidates(List<String> validCandidates) {

		if (validCandidates.isEmpty()) {
			return;
		}

		manager.acquireSession(true);
		try {
			manager.submitValidCandidates(validCandidates);
		}
		finally {
			manager.releaseSession();
		}
	}
}
