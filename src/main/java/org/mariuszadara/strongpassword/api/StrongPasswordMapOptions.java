package org.mariuszadara.strongpassword.api;

import java.util.Map;

/**
 * This file contains the definition for password options based on a map.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public class StrongPasswordMapOptions extends StrongPasswordOptions {

	/**
	 * Key for the password length
	 */
	public static final String PASSWORD_LENGTH_KEY = "password.length";
	/**
	 * Key for the minimum symbols count
	 */
	public static final String MIN_SYMBOLS_COUNT_KEY = "password.minSymbols";
	/**
	 * Key for the minimum numbers count
	 */
	public static final String MIN_NUMBERS_COUNT_KEY = "password.minNumbers";
	/**
	 * Key for minimum lowercase characters
	 */
	public static final String MIN_LOWERCASE_CHARACTERS_COUNT_KEY = "password.minLowercaseCharacters";
	/**
	 * Key for the minimum uppercare characters
	 */
	public static final String MIN_UPPERCASE_CHARACTERS_COUNT_KEY = "password.minUppercaseCharacters";
	/**
	 * Key to exclude similar characters
	 */
	public static final String EXCLUDE_SIMILAR_CHARACTERS_KEY = "engine.excludeSimilarCharacters";
	/**
	 * Key to exclude ambigous characters
	 */
	public static final String EXCLUDE_AMBIGOUS_CHARACTERS_KEY = "engine.excludeAmbigousCharacters";
	/**
	 * Key for maximum running time
	 */
	public static final String MAX_RUNNING_TIME_KEY = "engine.maxRunningTime";
	/**
	 * Key for maximum results
	 */
	public static final String MAX_RESULTS_KEY = "engine.maxResults";
	/**
	 * Key for threads count
	 */
	public static final String THREADS_COUNT_KEY = "engine.threadsCount";
	/**
	 * Key for the symbols to use
	 */
	public static final String SYMBOLS_KEY = "dictionary.symbols";
	/**
	 * Key for the numbers to use
	 */
	public static final String NUMBERS_KEY = "dictionary.numbers";
	/**
	 * Key for the lowercase characters
	 */
	public static final String LOWERCASE_CHARACTERS_KEY = "dictionary.lowercaseCharacters";
	/**
	 * Key for the uppercase characters
	 */
	public static final String UPPERCASE_CHARACTERS_KEY = "dictionary.uppercaseCharacters";
	/**
	 * Key for the similar characters
	 */
	public static final String SIMILAR_CHARACTERS_KEY = "dictionary.similarCharacters";
	/**
	 * Key for the ambigous characters
	 */
	public static final String AMBIGOUS_CHARACTERS_KEY = "dictionary.ambigousCharacters";
	
	
	/**
	 * Constructor using a map
	 * @param options The map of options to use
	 */
	public StrongPasswordMapOptions(Map<String, Object> options) {
		super();
		loadFromOptions(options);
	}

	protected final void loadFromOptions(Map<String, Object> options) {

		if (options == null || options.isEmpty()) {
			return;
		}

		setPasswordLength(options.getOrDefault(PASSWORD_LENGTH_KEY, PASSWORD_LENGTH));
		setMinSymbolsCount(options.getOrDefault(MIN_SYMBOLS_COUNT_KEY, MIN_SYMBOLS_COUNT));
		setMinNumbersCount(options.getOrDefault(MIN_NUMBERS_COUNT_KEY, MIN_NUMBERS_COUNT));
		setMinNumbersCount(options.getOrDefault(MIN_NUMBERS_COUNT_KEY, MIN_NUMBERS_COUNT));
		setMinLowercaseCharactersCount(options.getOrDefault(MIN_LOWERCASE_CHARACTERS_COUNT_KEY, MIN_LOWERCASE_CHARACTERS_COUNT));
		setMinUppercaseCharactersCount(options.getOrDefault(MIN_UPPERCASE_CHARACTERS_COUNT_KEY, MIN_UPPERCASE_CHARACTERS_COUNT));
		setExcludeSimilarCharacters(options.getOrDefault(EXCLUDE_SIMILAR_CHARACTERS_KEY, EXCLUDE_SIMILAR_CHARACTERS));
		setExcludeAmbigousCharacters(options.getOrDefault(EXCLUDE_AMBIGOUS_CHARACTERS_KEY, EXCLUDE_AMBIGOUS_CHARACTERS));
		setMaxRunningTime(options.getOrDefault(MAX_RUNNING_TIME_KEY, MAX_RUNNING_TIME));
		setThreadsCount(options.getOrDefault(THREADS_COUNT_KEY, MAX_THREADS_COUNT));
		setSymbols(options.getOrDefault(SYMBOLS_KEY, SYMBOLS));
		setNumbers(options.getOrDefault(NUMBERS_KEY, NUMBERS));
		setLowercaseCharacters(options.getOrDefault(LOWERCASE_CHARACTERS_KEY, LOWERCASE_CHARACTERS));
		setUppercaseCharacters(options.getOrDefault(UPPERCASE_CHARACTERS_KEY, UPPERCASE_CHARACTERS));
		setSimilarCharacters(options.getOrDefault(SIMILAR_CHARACTERS_KEY, SIMILAR_CHARACTERS));
		setAmbigousCharacters(options.getOrDefault(AMBIGOUS_CHARACTERS_KEY, AMBIGOUS_CHARACTERS));
		setMaxResultsCount(options.getOrDefault(MAX_RESULTS_KEY, MAX_RESULTS_COUNT));
	}
}
