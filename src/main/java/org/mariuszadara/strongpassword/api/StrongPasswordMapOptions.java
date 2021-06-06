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
	public static final String LENGTH_KEY = "password.length";
	/**
	 * Key for the minimum symbols count
	 */
	public static final String MIN_SYMBOLS_KEY = "password.minSymbols";
	/**
	 * Key for the minimum numbers count
	 */
	public static final String MIN_NUMBERS_KEY = "password.minNumbers";
	/**
	 * Key for minimum lowercase characters
	 */
	public static final String MIN_LOWERCASE_CHARACTERS_KEY = "password.minLowercaseCharacters";
	/**
	 * Key for the minimum uppercare characters
	 */
	public static final String MIN_UPPERCASE_CHARACTERS_KEY = "password.minUppercaseCharacters";
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
	public static final String MAX_THREADS_COUNT_KEY = "engine.threadsCount";
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
	 * @param map The map to use
	 */
	public StrongPasswordMapOptions(Map<String, Object> map) {
		super();
		loadFromMap(map);
	}

	protected final void loadFromMap(Map<String, Object> map) {

		if (map == null || map.isEmpty()) {
			return;
		}

		setLength((int) map.getOrDefault(LENGTH_KEY, DEFAULT_LENGTH));
		setMinSymbolsCount((int) map.getOrDefault(MIN_SYMBOLS_KEY, DEFAULT_MIN_SYMBOLS_COUNT));
		setMinNumbersCount((int) map.getOrDefault(MIN_NUMBERS_KEY, DEFAULT_MIN_NUMBERS_COUNT));
		setMinLowercaseCharactersCount((int) map.getOrDefault(MIN_LOWERCASE_CHARACTERS_KEY, DEFAULT_MIN_LOWERCASE_CHARACTERS_COUNT));
		setMinUppercaseCharactersCount((int) map.getOrDefault(MIN_UPPERCASE_CHARACTERS_KEY, DEFAULT_MIN_UPPERCASE_CHARACTERS_COUNT));
		setExcludeSimilarCharacters((boolean) map.getOrDefault(EXCLUDE_SIMILAR_CHARACTERS_KEY, DEFAULT_EXCLUDE_SIMILAR_CHARACTERS));
		setExcludeAmbigousCharacters((boolean) map.getOrDefault(EXCLUDE_AMBIGOUS_CHARACTERS_KEY, DEFAULT_EXCLUDE_AMBIGOUS_CHARACTERS));
		setMaxRunningTime((int) map.getOrDefault(MAX_RUNNING_TIME_KEY, DEFAULT_MAX_RUNNING_TIME));
		setThreadsCount((int) map.getOrDefault(MAX_THREADS_COUNT_KEY, DEFAULT_MAX_THREADS_COUNT));
		setSymbols((String) map.getOrDefault(SYMBOLS_KEY, DEFAULT_SYMBOLS));
		setNumbers((String) map.getOrDefault(NUMBERS_KEY, DEFAULT_NUMBERS));
		setLowercaseCharacters((String) map.getOrDefault(LOWERCASE_CHARACTERS_KEY, DEFAULT_LOWERCASE_CHARACTERS));
		setUppercaseCharacters((String) map.getOrDefault(UPPERCASE_CHARACTERS_KEY, DEFAULT_UPPERCASE_CHARACTERS));
		setSimilarCharacters((String) map.getOrDefault(SIMILAR_CHARACTERS_KEY, DEFAULT_SIMILAR_CHARACTERS));
		setAmbigousCharacters((String) map.getOrDefault(AMBIGOUS_CHARACTERS_KEY, DEFAULT_AMBIGOUS_CHARACTERS));
		setMaxResultsCount((int) map.getOrDefault(MAX_RESULTS_KEY, DEFAULT_MAX_RESULTS_COUNT));
	}
}
