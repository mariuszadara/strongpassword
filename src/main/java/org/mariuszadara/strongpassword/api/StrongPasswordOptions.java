
package org.mariuszadara.strongpassword.api;

/**
 * This file contains the definition for the strong password options.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public class StrongPasswordOptions {
	
	/**
	 * Default password length
	 */
	public static final int DEFAULT_LENGTH = 18;
	/**
	 * Default minimum symbols count
	 */
	public static final int DEFAULT_MIN_SYMBOLS_COUNT = 4;
	/**
	 * Default minimum numbers count
	 */
	public static final int DEFAULT_MIN_NUMBERS_COUNT = 4;
	/**
	 * Default minimum lowercase characters
	 */
	public static final int DEFAULT_MIN_LOWERCASE_CHARACTERS_COUNT = 4;
	/**
	 * Default minimum uppercase characters
	 */
	public static final int DEFAULT_MIN_UPPERCASE_CHARACTERS_COUNT = 4;
	/**
	 * Default exclude for similar characters
	 */
	public static final boolean DEFAULT_EXCLUDE_SIMILAR_CHARACTERS = true;
	/**
	 * Default exclude ambigous characters
	 */
	public static final boolean DEFAULT_EXCLUDE_AMBIGOUS_CHARACTERS = false;
	/**
	 * Default maximum running time (milliseconds)
	 */
	public static final int DEFAULT_MAX_RUNNING_TIME = 30_000;
	/**
	 * Default maximum results count
	 */
	public static final int DEFAULT_MAX_RESULTS_COUNT = 5;
	/**
	 * Default maximum threads count
	 */
	public static final int DEFAULT_MAX_THREADS_COUNT = 2;
	/**
	 * Default symbol characters
	 */
	public static final String DEFAULT_SYMBOLS = "{~`!@#$%',^&*()-_+={[}]\\|:;'\",<.>/?}";
	/**
	 * Default number characters
	 */
	public static final String DEFAULT_NUMBERS = "0123456789";
	/**
	 * Default lowercase characters
	 */
	public static final String DEFAULT_LOWERCASE_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm";
	/**
	 * Default uppercase characters
	 */
	public static final String DEFAULT_UPPERCASE_CHARACTERS = "QWERTYUIOPASDFGHJKLZXCVBNM";
	/**
	 * Default similar characters
	 */
	public static final String DEFAULT_SIMILAR_CHARACTERS = "il1Lo0OE3";
	/**
	 * Default ambigous characters
	 */
	public static final String DEFAULT_AMBIGOUS_CHARACTERS = "{}[]()/\\,'\"`~,;:.<>";
	/**
	 * Maximum running time limit (milliseconds)
	 */
	public static final int MAX_RUNNING_TIME_LIMIT = 60_000;
	/**
	 * Maximum results limit
	 */
	public static final int MAX_RESULTS_LIMIT = 10;
	/**
	 * Maximum password length limit
	 */
	public static final int MAX_PASSWORD_LENGTH_LIMIT = 30;
	/**
	 * Minimum password length limit
	 */
	public static final int MIN_PASSWORD_LENGTH_LIMIT = 8;
	
	
	/**
	 * This field contains the current password length.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_LENGTH}.
	 */
	protected int length = DEFAULT_LENGTH;
	/**
	 * This field contains the minimum symbols count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MIN_SYMBOLS_COUNT}.
	 */
	protected int minSymbolsCount = DEFAULT_MIN_SYMBOLS_COUNT;
	/**
	 * This field contains the minimum numbers count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MIN_NUMBERS_COUNT}.
	 */
	protected int minNumbersCount = DEFAULT_MIN_NUMBERS_COUNT;
	/**
	 * This field contains the minimum lowercase characters count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MIN_LOWERCASE_CHARACTERS_COUNT}.
	 */
	protected int minLowercaseCharactersCount = DEFAULT_MIN_LOWERCASE_CHARACTERS_COUNT;
	/**
	 * This field contains the minimum uppercase characters count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MIN_UPPERCASE_CHARACTERS_COUNT}.
	 */
	protected int minUppercaseCharactersCount = DEFAULT_MIN_UPPERCASE_CHARACTERS_COUNT;
	/**
	 * This field contains the similar characters exclusion flag.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_EXCLUDE_SIMILAR_CHARACTERS}.
	 */
	protected boolean excludeSimilarCharacters = DEFAULT_EXCLUDE_SIMILAR_CHARACTERS;
	/**
	 * This field contains the ambigous characters exclusion flag.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_EXCLUDE_AMBIGOUS_CHARACTERS}.
	 */
	protected boolean excludeAmbigousCharacters = DEFAULT_EXCLUDE_AMBIGOUS_CHARACTERS;
	/**
	 * This field contains the maximum running time in milliseconds.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MAX_RUNNING_TIME}.
	 */
	protected int maxRunningTime = DEFAULT_MAX_RUNNING_TIME;
	/**
	 * This field contains the maximum results count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MAX_RESULTS_COUNT}.
	 */
	protected int maxResults = DEFAULT_MAX_RESULTS_COUNT;
	/**
	 * This field contains the threads count.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_MAX_THREADS_COUNT}.
	 */
	protected int maxThreadsCount = DEFAULT_MAX_THREADS_COUNT;
	/**
	 * This field contains the symbol characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_SYMBOLS}.
	 */
	protected String symbols = DEFAULT_SYMBOLS;
	/**
	 * This field contains the number characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_NUMBERS}.
	 */
	protected String numbers = DEFAULT_NUMBERS;
	/**
	 * This field contains the lowercase characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_LOWERCASE_CHARACTERS}.
	 */
	protected String lowercaseCharacters = DEFAULT_LOWERCASE_CHARACTERS;
	/**
	 * This field contains the the uppercase characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_UPPERCASE_CHARACTERS}.
	 */
	protected String uppercaseCharacters = DEFAULT_UPPERCASE_CHARACTERS;
	/**
	 * This field contains the similar characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_SIMILAR_CHARACTERS}.
	 */
	protected String similarCharacters = DEFAULT_SIMILAR_CHARACTERS;
	/**
	 * This field contains the ambigous characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#DEFAULT_AMBIGOUS_CHARACTERS}.
	 */
	protected String ambigousCharacters = DEFAULT_AMBIGOUS_CHARACTERS;


	/**
	 * Sets the length of the password
	 * @param length The length of the password
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * Obtains the password length
	 * @return The password length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the minimum symbols count to use
	 * @param count The minimum symbols count
	 */
	public void setMinSymbolsCount(int count) {
		this.minSymbolsCount = count;
	}
	
	/**
	 * Obtains the minimum symbols count to use
	 * @return The minimum symbols count to use
	 */
	public int getMinSymbolsCount() {
		return minSymbolsCount;
	}

	/**
	 * Check if the symbol characters should be used
	 * @return <code>true</code> if the symbol characters should be used, <code>false</code> otherwise
	 */
	public boolean shouldUseSymbols() {
		return minSymbolsCount > 0 && symbols != null && symbols.length() > 0;
	}
	
	/**
	 * Sets the minimum numbers count
	 * @param count The minimum numbers count
	 */
	public void setMinNumbersCount(int count) {
		minNumbersCount = count;
	}
	
	/**
	 * Obtains the minimum numbers to use
	 * @return The minimum numbers to use
	 */
	public int getMinNumbersCount() {
		return minNumbersCount;
	}

	/**
	 * Check if the numbers should be used
	 * @return <code>true</code> if the numbers should be used, <code>false</code> otherwise
	 */
	public boolean shouldUseNumbers() {
		return minNumbersCount > 0 && numbers != null && numbers.length() > 0;
	}

	/**
	 * Sets the minimum lowercase characters
	 * @param count The minimum lowercase characters
	 */
	public void setMinLowercaseCharactersCount(int count) {
		minLowercaseCharactersCount = count;
	}
	
	/**
	 * Obtains the minimum lowercase characters
	 * @return The minimum lowercase characters
	 */
	public int getMinLowercaseCharactersCount() {
		return minLowercaseCharactersCount;
	}
	
	/**
	 * Check if the lowercase characters should be used
	 * @return <code>true</code> if the lowercase characters should be used, <code>false</code> otherwise
	 */
	public boolean shouldUseLowercaseCharacters() {
		return minLowercaseCharactersCount > 0 && lowercaseCharacters != null && lowercaseCharacters.length() > 0;
	}
	
	/**
	 * Sets the minimum characters count
	 * @param count The minimum characters count
	 */
	public void setMinUppercaseCharactersCount(int count) {
		minUppercaseCharactersCount = count;
	}
	
	/**
	 * Obtains the minimum characters count
	 * @return The minimum characters count
	 */
	public int getMinUppercaseCharactersCount() {
		return minUppercaseCharactersCount;
	}
	
	/**
	 * Check if the uppercase characters should be used
	 * @return <code>true</code> if the uppercase characters should be used, <code>false</code> otherwise
	 */
	public boolean shouldUseUppercaseCharacters() {
		return minUppercaseCharactersCount > 0 && uppercaseCharacters != null && uppercaseCharacters.length() > 0;
	}
	
	/**
	 * Set the flag that indicates if the similar characters should be excluded
	 * @param exclude <code>True</code> to exclude similar characters, <code>false</code> otherwise
	 */
	public void setExcludeSimilarCharacters(boolean exclude) {
		excludeSimilarCharacters = exclude;
	}
	
	/**
	 * Obtains the similar characters
	 * @return The similar characters
	 */
	public boolean excludeSimilarCharacters() {
		return excludeSimilarCharacters;
	}
	
	/**
	 * Set the flag that indicates if the ambigous characters should be excluded
	 * @param exclude <code>True</code> to exclude amibous characters, <code>false</code> otherwise
	 */
	public void setExcludeAmbigousCharacters(boolean exclude) {
		excludeAmbigousCharacters = exclude;
	}
	
	/**
	 * Obtains the ambigous characters
	 * @return The ambigous characters
	 */
	public boolean excludeAmbigousCharacters() {
		return excludeAmbigousCharacters;
	}
	
	/**
	 * Obtains the maximum running time
	 * @param time The maximum running time
	 */
	public void setMaxRunningTime(int time) {
		maxRunningTime = time;
	}
	
	/**
	 * Obtains the maximum running time
	 * @return The maximum running time
	 */
	public int getMaxRunningTime() {
		return maxRunningTime;
	}
	
	/**
	 * Obtains the maximum results 
	 * @param count The maximum results
	 */
	public void setMaxResultsCount(int count) {
		maxResults = count;
	}
	
	/**
	 * Obtains the maximum results 
	 * @return The maximum results
	 */
	public int getMaxResultsCount() {
		return maxResults;
	}
	
	/**
	 * Obtains the number of threads to use
	 * @return The number of threads
	 */
	public int getThreadsCount() {
		return maxThreadsCount;
	}
	
	/**
	 * Obtains the number of threads to use
	 * @param count The number of threads
	 */
	public void setThreadsCount(int count) {
		maxThreadsCount = count;
	}
	
	/**
	 * Obtains the symbols used
	 * @return The sumbols used
	 */
	public String getSymbols() {
		return symbols;
	}

	/**
	 * Obtains the symbols used
	 * @param symbols The sumbols to use use
	 */
	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}
	
	/**
	 * Obtains the numbers 
	 * @param numbers The numbers
	 */
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	
	/**
	 * Obtains the numbers 
	 * @return The numbers
	 */
	public String getNumbers() {
		return numbers;
	}

	
	/**
	 * Obtains the lowercase characters
	 * @param chars The lowercase characters
	 */
	public void setLowercaseCharacters(String chars) {
		lowercaseCharacters = chars;
	}
	
	/**
	 * Obtains the lowercase characters
	 * @return The lowercase characters
	 */
	public String getLowercaseCharacters() {
		return lowercaseCharacters;
	}
	
	/**
	 * Obtains the uppercare characters
	 * @param chars The uppercase characters
	 */
	public void setUppercaseCharacters(String chars) {
		uppercaseCharacters = chars;
	}

	/**
	 * Obtains the uppercare characters
	 * @return The uppercase characters
	 */
	public String getUppercaseCharacters() {
		return uppercaseCharacters;
	}
	
	/**
	 * Obtinas the similar characters
	 * @param chars The similar characters
	 */
	public void setSimilarCharacters(String chars) {
		similarCharacters = chars;
	}

	/**
	 * Obtainas the similar characters
	 * @return The similar characters
	 */
	public String getSimilarCharacters() {
		return similarCharacters;
	}
	
	/**
	 * Obtains the ambigous characters
	 * @param chars The ambigous characters
	 */
	public void setAmbigousCharacters(String chars) {
		ambigousCharacters = chars;
	}
	
	/**
	 * Obtains the ambigous characters
	 * @return The ambigous characters
	 */
	public String getAmbigousCharacters() {
		return ambigousCharacters;
	}

	/**
	 * Validates the current options
	 */
	public void validate() {
		validateLength();
		validateMinSymbols();
		validateMinNumbers();
		validateMinLowercaseCharacters();
		validateMinUppercaseCharacters();
		validateMaxRunningTime();
		validateMaxResults();
		validateMaxThreads();
		validateMins();
	}
	
	private void validateLength() {

		if (length <= 0) {
			throw new StrongPasswordException(StrongPasswordException.LENGTH_INVALID,
					"The length of the password should be a positive number, greater than 0");
		}

		// a password with less than 8 characters is considered unsafe,
		// so should not be used by default
		if (length < MIN_PASSWORD_LENGTH_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.LENGTH_TOO_SMALL, String
					.format("The length of the password should not be below %d characters", MIN_PASSWORD_LENGTH_LIMIT));
		}

		// there is no obvious advantage (at this point) generating a password with more
		// than 30 characters
		// it will just take too much time without a guarantee that will even be
		// generated
		if (length > MAX_PASSWORD_LENGTH_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.LENGTH_TOO_HIGH, String
					.format("The length of the password should not exceed %d characters", MAX_PASSWORD_LENGTH_LIMIT));
		}
	}

	private void validateMinSymbols() {
		if (minSymbolsCount == length) {
			throw new StrongPasswordException(StrongPasswordException.SYMBOLS_EQUAL_LENGTH,
					"The password should not be composed only by symbols");
		}
		if (minSymbolsCount > length) {
			throw new StrongPasswordException(StrongPasswordException.SYMBOLS_EXCEEDING_LENGTH,
					"The symbols count should not exceed the length of the password");
		}
	}

	private void validateMinNumbers() {
		if (minNumbersCount == length) {
			throw new StrongPasswordException(StrongPasswordException.NUMBERS_EQUAL_LENGTH,
					"The password should not be composed only by numbers");
		}
		if (minNumbersCount > length) {
			throw new StrongPasswordException(StrongPasswordException.NUMBERS_EXCEEDING_LENGTH,
					"The numbers count should not exceed the length of the password");
		}
	}

	private void validateMinLowercaseCharacters() {
		if (minLowercaseCharactersCount == length) {
			throw new StrongPasswordException(StrongPasswordException.LOWERCASE_CHARACTERS_EQUAL_LENGTH,
					"The password should not be composed only by lowercase characters");
		}
		if (minLowercaseCharactersCount > length) {
			throw new StrongPasswordException(StrongPasswordException.LOWERCASE_CHARACTERS_EXCEEDING_LENGTH,
					"The lowercase characters count should not exceed the length of the password");
		}
	}

	private void validateMinUppercaseCharacters() {
		if (minUppercaseCharactersCount == length) {
			throw new StrongPasswordException(StrongPasswordException.UPPERCASE_CHARACTERS_EQUAL_LENGTH,
					"The password should not be composed only by uppercase characters");
		}
		if (minUppercaseCharactersCount > length) {
			throw new StrongPasswordException(StrongPasswordException.UPPERCASE_CHARACTERS_EXCEEDING_LENGTH,
					"The uppercase characters count should not exceed the length of the password");
		}
	}

	private void validateMaxRunningTime() {
		if (maxRunningTime <= 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RUNNING_TIME_INVALID,
					"The maximum running time should be a positive number, greater than 0");
		}
		if (maxRunningTime > MAX_RUNNING_TIME_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RUNNING_TIME_TOO_HIGH,
					String.format("The maximum running time should not exceed %d ms", MAX_RUNNING_TIME_LIMIT));
		}
	}

	private void validateMaxResults() {
		if (maxResults <= 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_INVALID,
					"The maximum results should be a positive number, greater than 0");
		}
		if (maxResults > MAX_RESULTS_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_TOO_HIGH,
					String.format("The maximum results count should not exceed %d entries", MAX_RESULTS_LIMIT));
		}
	}

	private void validateMaxThreads() {
		if (maxThreadsCount <= 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_THREADS_INVALID,
					"the maximum threads count should a positive number, greater than 0");
		}
		int availableThreads = Runtime.getRuntime().availableProcessors();
		if (maxThreadsCount > availableThreads) {
			throw new StrongPasswordException(StrongPasswordException.MAX_THREADS_TOO_HIGHT,
					String.format("The maximum threads count should not exceed %d", availableThreads));
		}
	}
	
	private void validateMins() {
		
		int realLength =
				(shouldUseSymbols() ? minSymbolsCount : 0) +
				(shouldUseNumbers() ? minNumbersCount : 0) + 
				(shouldUseLowercaseCharacters() ? minLowercaseCharactersCount : 0) + 
				(shouldUseUppercaseCharacters() ? minUppercaseCharactersCount : 0);
		
		if (realLength == 0) {
			throw new StrongPasswordException(StrongPasswordException.EXPECTED_LENGTH_IS_ZERO, 
				"None of the generated passwords will be valid since the actual length will be equal to 0 (zero) since no dictionary is to be used.");
		}
		
		if (realLength > length) {
			throw new StrongPasswordException(StrongPasswordException.EXPECTED_MIN_LENGTH_GREATER_REQUIRED_LENGTH, 
				String.format("The expected minimum length of the password resulting from combining dictionaries exceeds the password length: actual length=%d, required length=%d", realLength, length));
		}
	}
}
