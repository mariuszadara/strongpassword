
package org.mariuszadara.strongpassword.api;

/**
 * This file contains the definition for the strong password options.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public class StrongPasswordOptions {
	
	/**
	 * The default password length
	 */
	public static final int PASSWORD_LENGTH = 18;
	
	/**
	 * The lower limit for the password length
	 */
	public static final int PASSWORD_LENGTH_LOWER_LIMIT = 8;
	
	/**
	 * The upper limit for the password length
	 */
	public static final int PASSWORD_LENGTH_UPPER_LIMIT = 30;
	
	/**
	 * The default minimum symbols count
	 */
	public static final int MIN_SYMBOLS_COUNT = 4;
	
	/**
	 * The lower limit for minimum symbols count
	 */
	public static final int MIN_SYMBOLS_COUNT_LOWER_LIMIT = 2;
	
	/**
	 * The default minimum numbers count
	 */
	public static final int MIN_NUMBERS_COUNT = 4;
	
	/**
	 * The lower limit for minimum numbers count
	 */
	public static final int MIN_NUMBERS_COUNT_LOWER_LIMIT = 2;
	
	/**
	 * The default minimum lowercase characters count
	 */	
	public static final int MIN_LOWERCASE_CHARACTERS_COUNT = 4;
	
	/**
	 * The lower limit for the minimum lowercase characters count
	 */	
	public static final int MIN_LOWERCASE_CHARACTERS_COUNT_LOWER_LIMIT = 2;
	
	/**
	 * The default minimum uppercase characters count
	 */	
	public static final int MIN_UPPERCASE_CHARACTERS_COUNT = 4;
	
	/**
	 * The lower limit for the minimum lowercase characters count
	 */	
	public static final int MIN_UPPERCASE_CHARACTERS_COUNT_LOWER_LIMIT = 2;

	/**
	 * The default maximum running time
	 */	
	public static final int MAX_RUNNING_TIME = 10_000;
	
	/**
	 * The upper limit for the minimum lowercase characters count
	 */	
	public static final int MAX_RUNNING_TIME_UPPER_LIMIT = 15_000;
	
	/**
	 * The default maximum results count
	 */
	public static final int MAX_RESULTS_COUNT = 5;
	
	/**
	 * The upper limit for the maximum results count
	 */
	public static final int MAX_RESULTS_COUNT_UPPER_LIMIT = 15;
	
	/**
	 * The default maximum threads count
	 */	
	public static final int MAX_THREADS_COUNT = 2;
	
	/**
	 * The upper limit for the maximum threads count
	 */
	public static final int MAX_THREADS_COUNT_UPPER_LIMIT = Runtime.getRuntime().availableProcessors();
	
	/**
	 * The upper limit for the maximum symbols dictionary count
	 */
	public static final int SYMBOLS_MAX_LENGTH = 256;
	
	/**
	 * The upper limit for the maximum numbers dictionary count
	 */
	public static final int NUMBERS_MAX_LENGTH = 256;
	
	/**
	 * The upper limit for the maximum lowercase characters dictionary count
	 */
	public static final int LOWERCASE_CHARACTERS_MAX_LENGTH = 256;
	
	/**
	 * The upper limit for the maximum uppercase characters dictionary count
	 */
	public static final int UPPERCASE_CHARACTERS_MAX_LENGTH = 256;
	
	/**
	 * The upper limit for the maximum ambigous characters dictionary count
	 */
	public static final int AMBIGOUS_CHARACTERS_MAX_LENGTH = 256;
	
	/**
	 * The upper limit for the maximum similar characters dictionary count
	 */
	public static final int SIMILAR_CHARACTERS_MAX_LENGTH = 256;
	
	/**
	 * Default exclude for similar characters
	 */
	public static final boolean EXCLUDE_SIMILAR_CHARACTERS = true;

	/**
	 * Default exclude ambigous characters
	 */
	public static final boolean EXCLUDE_AMBIGOUS_CHARACTERS = false;
	
	/**
	 * Default symbol characters
	 */
	public static final String SYMBOLS = "{~`!@#$%',^&*()-_+={[}]\\|:;'\",<.>/?}";
	
	/**
	 * Default number characters
	 */
	public static final String NUMBERS = "0123456789";
	
	/**
	 * Default lowercase characters
	 */
	public static final String LOWERCASE_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm";
	
	/**
	 * Default uppercase characters
	 */
	public static final String UPPERCASE_CHARACTERS = "QWERTYUIOPASDFGHJKLZXCVBNM";
	
	/**
	 * Default similar characters
	 */
	public static final String SIMILAR_CHARACTERS = "il1Lo0OE3";
	
	/**
	 * Default ambigous characters	
	 */
	public static final String AMBIGOUS_CHARACTERS = "{}[]()/\\,'\"`~,;:.<>";
	
	
	/**
	 * This field contains the current password length.
	 * The initial value is set to {@link StrongPasswordOptions#PASSWORD_LENGTH}.
	 */
	protected int passwordLength = PASSWORD_LENGTH;
	
	/**
	 * This field contains the minimum symbols count.
	 * The initial value is set to {@link StrongPasswordOptions#MIN_SYMBOLS_COUNT}.
	 */
	protected int minSymbolsCount = MIN_SYMBOLS_COUNT;
	
	/**
	 * This field contains the minimum numbers count.
	 * The initial value is set to {@link StrongPasswordOptions#MIN_NUMBERS_COUNT}.
	 */
	protected int minNumbersCount = MIN_NUMBERS_COUNT;
	
	/**
	 * This field contains the minimum lowercase characters count.
	 * The initial value is set to {@link StrongPasswordOptions#MIN_LOWERCASE_CHARACTERS_COUNT}.
	 */
	protected int minLowercaseCharactersCount = MIN_LOWERCASE_CHARACTERS_COUNT;
	
	/**
	 * This field contains the minimum uppercase characters count.
	 * The initial value is set to {@link StrongPasswordOptions#MIN_UPPERCASE_CHARACTERS_COUNT}.
	 */
	protected int minUppercaseCharactersCount = MIN_UPPERCASE_CHARACTERS_COUNT;
	
	/**
	 * This field contains the similar characters exclusion flag.
	 * The initial value is set to {@link StrongPasswordOptions#EXCLUDE_SIMILAR_CHARACTERS}.
	 */
	protected boolean excludeSimilarCharacters = EXCLUDE_SIMILAR_CHARACTERS;
	
	/**
	 * This field contains the ambigous characters exclusion flag.
	 * The initial value is set to {@link StrongPasswordOptions#EXCLUDE_AMBIGOUS_CHARACTERS}.
	 */
	protected boolean excludeAmbigousCharacters = EXCLUDE_AMBIGOUS_CHARACTERS;
	
	/**
	 * This field contains the maximum running time in milliseconds.
	 * The initial value is set to {@link StrongPasswordOptions#MAX_RUNNING_TIME}.
	 */
	protected int maxRunningTime = MAX_RUNNING_TIME;
	
	/**
	 * This field contains the maximum results count.
	 * The initial value is set to {@link StrongPasswordOptions#MAX_RESULTS_COUNT}.
	 */
	protected int maxResultsCount = MAX_RESULTS_COUNT;
	
	/**
	 * This field contains the threads count.
	 * The initial value is set to {@link StrongPasswordOptions#MAX_THREADS_COUNT}.
	 */
	protected int maxThreadsCount = MAX_THREADS_COUNT;
	
	/**
	 * This field contains the symbol characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#SYMBOLS}.
	 */
	protected String symbolCharacters = SYMBOLS;
	
	/**
	 * This field contains the number characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#NUMBERS}.
	 */
	protected String numberCharacters = NUMBERS;
	
	/**
	 * This field contains the lowercase characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#LOWERCASE_CHARACTERS}.
	 */
	protected String lowercaseCharacters = LOWERCASE_CHARACTERS;
	
	/**
	 * This field contains the the uppercase characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#UPPERCASE_CHARACTERS}.
	 */
	protected String uppercaseCharacters = UPPERCASE_CHARACTERS;
	
	/**
	 * This field contains the similar characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#SIMILAR_CHARACTERS}.
	 */
	protected String similarCharacters = SIMILAR_CHARACTERS;
	
	/**
	 * This field contains the ambigous characters to be used by the generator.
	 * The initial value is set to {@link StrongPasswordOptions#AMBIGOUS_CHARACTERS}.
	 */
	protected String ambigousCharacters = AMBIGOUS_CHARACTERS;


	/**
	 * Sets the length of the password
	 * @param length The length of the password
	 */
	public void setPasswordLength(Object length) {
		
		if (!(length instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.PASSWORD_LENGTH_NOT_A_NUMBER,
				"The length of the password is invalid");
		}
		
		passwordLength = (int) length;
		
		if (passwordLength < 0) {
			throw new StrongPasswordException(StrongPasswordException.PASSWORD_LENGTH_NEGATIVE,
				"The length of the password is negative");
		}
		
		if (passwordLength < PASSWORD_LENGTH_LOWER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.PASSWORD_LENGTH_BELOW_LOWER_LIMIT, 
				String.format("The actual password length is below the minimum allowed length: actual=%d, minimum=%d", passwordLength, PASSWORD_LENGTH_LOWER_LIMIT));
		}
		
		if (passwordLength > PASSWORD_LENGTH_UPPER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.PASSWORD_LENGTH_ABOVE_UPPER_LIMIT, 
				String.format("The actual password length exceeds the maximum allowed length: actual=%d, minimum=%d", passwordLength, PASSWORD_LENGTH_UPPER_LIMIT));
		}
	}
	
	/**
	 * Obtains the password length
	 * @return The password length
	 */
	public int getPasswordLength() {
		return passwordLength;
	}

	/**
	 * Sets the minimum symbols count to use
	 * @param count The minimum symbols count
	 */
	public void setMinSymbolsCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MIN_SYMBOLS_COUNT_NOT_A_NUMBER, 
				"The minimum symbols count is invalid");
		}
		
		minSymbolsCount = (int) count;
		
		if (minSymbolsCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MIN_SYMBOLS_COUNT_NEGATIVE,
				"The minimum symbols count is negative");
		}
		
		if (minSymbolsCount < MIN_SYMBOLS_COUNT_LOWER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MIN_SYMBOLS_COUNT_BELOW_LOWER_LIMIT, 
				String.format("The password should containt at least %d symols", MIN_SYMBOLS_COUNT_LOWER_LIMIT));
		}
				
		if (minSymbolsCount == passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_SYMBOLS_COUNT_EQUALS_PASSWORD_LENGTH,
				"A strong password cannot be composed only by symbols");
		}
		
		
		if (minSymbolsCount > passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_SYMBOLS_COUNT_EXCEEDS_PASSWORD_LENGTH, 
				String.format("The symbols count exceeds the password length: count=%d, length=%d", minSymbolsCount, passwordLength));
		}
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
		return minSymbolsCount > 0 && symbolCharacters != null && !symbolCharacters.trim().isEmpty();
	}
	
	/**
	 * Sets the minimum numbers count
	 * @param count The minimum numbers count
	 */
	public void setMinNumbersCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MIN_NUMBERS_COUNT_NOT_A_NUMBER,
				"The minimum numbers count is invalid");
		}
		
		minNumbersCount = (int) count;
		
		if (minNumbersCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MIN_NUMBERS_COUNT_NEGATIVE,
				"The minimum numbers count is negative");
		}
				
		if (minNumbersCount < MIN_NUMBERS_COUNT_LOWER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MIN_NUMBERS_COUNT_BELOW_LOWER_LIMIT, 
				String.format("The password should containt at least %d numbers", MIN_NUMBERS_COUNT_LOWER_LIMIT));
		}
		
		if (minNumbersCount == passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_NUMBERS_COUNT_EQUALS_PASSWORD_LENGTH,
				"A strong password cannot be composed only by numbers");
		}
		
		if (minNumbersCount > passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_NUMBERS_COUNT_EXCEEDS_PASSWORD_LENGTH, 
				String.format("The numbers count exceeds the password length: count=%d, length=%d", minNumbersCount, passwordLength));
		}
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
		return minNumbersCount > 0 && numberCharacters != null && !numberCharacters.trim().isEmpty();
	}

	/**
	 * Sets the minimum lowercase characters
	 * @param count The minimum lowercase characters
	 */
	public void setMinLowercaseCharactersCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_COUNT_NOT_A_NUMBER,
				"The minimum lowercase characters count is invalid");
		}
		
		minLowercaseCharactersCount = (int) count;
		
		if (minLowercaseCharactersCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_NEGATIVE, 
				"The minimum lowercase characters count is negative");
		}
		
		if (minLowercaseCharactersCount < MIN_LOWERCASE_CHARACTERS_COUNT_LOWER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_BELOW_LOWER_LIMIT, 
				String.format("The password should containt at least %d lowercase characters", MIN_LOWERCASE_CHARACTERS_COUNT_LOWER_LIMIT));
		}

		if (minLowercaseCharactersCount == passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH, 
				"A strong password cannot be composed only by lowercase characters");
		}
		
		if (minLowercaseCharactersCount > passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH, 
				String.format("The lowercase characters count exceeds the password length: count=%d, length=%d", minNumbersCount, passwordLength));
		}
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
		return minLowercaseCharactersCount > 0 && lowercaseCharacters != null && !lowercaseCharacters.trim().isEmpty();
	}
	
	/**
	 * Sets the minimum characters count
	 * @param count The minimum characters count
	 */
	public void setMinUppercaseCharactersCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_COUNT_NOT_A_NUMBER,
				"The minimum uppercase characters count is invalid");
		}
		
		minUppercaseCharactersCount = (int) count;
		
		if (minUppercaseCharactersCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_NEGATIVE, 
				"The minimum uppercase characters count is negative");
		}
		
		if (minUppercaseCharactersCount < MIN_UPPERCASE_CHARACTERS_COUNT_LOWER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_BELOW_LOWER_LIMIT, 
				String.format("The password should containt at least %d uppercase characters", MIN_UPPERCASE_CHARACTERS_COUNT_LOWER_LIMIT));
		}

		if (minUppercaseCharactersCount == passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH, 
				"A strong password cannot be composed only by uppercase characters");
		}
		
		if (minUppercaseCharactersCount > passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH, 
				String.format("The uppercase characters count exceeds the password length: count=%d, length=%d", minUppercaseCharactersCount, passwordLength));
		}
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
		return minUppercaseCharactersCount > 0 && uppercaseCharacters != null && !uppercaseCharacters.trim().isEmpty();
	}
	
	/**
	 * Set the flag that indicates if the similar characters should be excluded
	 * @param exclude <code>True</code> to exclude similar characters, <code>false</code> otherwise
	 */
	public void setExcludeSimilarCharacters(Object exclude) {
		
		if (!(exclude instanceof Boolean)) {
			throw new StrongPasswordException(StrongPasswordException.EXCLUDE_SIMILAR_CHARACTERS_FLAG_INVALID,
				"The exclude similar characters flag is invalid");
		}
		
		excludeSimilarCharacters = (boolean) exclude;
	}
	
	/**
	 * Obtains the similar characters
	 * @return The similar characters
	 */
	public boolean shouldExcludeSimilarCharacters() {
		return excludeSimilarCharacters;
	}
	
	/**
	 * Set the flag that indicates if the ambigous characters should be excluded
	 * @param exclude <code>True</code> to exclude ambigous characters, <code>false</code> otherwise
	 */
	public void setExcludeAmbigousCharacters(Object exclude) {
		
		if (!(exclude instanceof Boolean)) {
			throw new StrongPasswordException(StrongPasswordException.EXCLUDE_AMBIGOUS_CHARACTERS_FLAG_INVALID,
				"The exclude ambigous characters flag is invalid");
		}
		
		excludeAmbigousCharacters = (boolean) exclude;
	}
	
	/**
	 * Obtains the ambigous characters
	 * @return The ambigous characters
	 */
	public boolean shouldExcludeAmbigousCharacters() {
		return excludeAmbigousCharacters;
	}
	
	/**
	 * Obtains the maximum running time
	 * @param time The maximum running time
	 */
	public void setMaxRunningTime(Object time) {
		
		if (!(time instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RUNNING_TIME_NOT_A_NUMBER,
				"The maximum running time is invalid");
		}
		
		maxRunningTime = (int) time;
		
		if (maxRunningTime < 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RUNNING_TIME_NEGATIVE, 
				"The maximum running time is negative");
		}
		
		if (maxRunningTime == 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RUNNING_TIME_ZERO, 
				"The maximum running time cannot be equal to zero milliseconds");
		}

		if (maxRunningTime > MAX_RUNNING_TIME_UPPER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH, 
				String.format("The maximum running time exceeds the maximum allowed value: actual=%d, max=%d", maxRunningTime, MAX_RUNNING_TIME_UPPER_LIMIT));
		}
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
	public void setMaxResultsCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_COUNT_NOT_A_NUMBER,
				"The maximum results count is invalid");
		}
		
		maxResultsCount = (int) count;
		
		if (maxResultsCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_COUNT_NEGATIVE, 
				"The maximum results count is negative");
		}
		
		if (maxResultsCount == 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_COUNT_ZERO, 
				"The maximum results count cannot be equal to zero");
		}

		if (maxResultsCount > MAX_RESULTS_COUNT_UPPER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_COUNT_EXCEEDS_UPPER_LIMIT, 
				String.format("The maximum results count exceeds the maximum allowed value: actual=%d, max=%d", maxResultsCount, MAX_RESULTS_COUNT_UPPER_LIMIT));
		}
	}
	
	/**
	 * Obtains the maximum results 
	 * @return The maximum results
	 */
	public int getMaxResultsCount() {
		return maxResultsCount;
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
	public void setThreadsCount(Object count) {
		
		if (!(count instanceof Integer)) {
			throw new StrongPasswordException(StrongPasswordException.MAX_THREADS_COUNT_NOT_A_NUMBER,
				"The maximum threads count is invalid");
		}
		
		maxThreadsCount = (int) count;
		
		if (maxThreadsCount < 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_THREADS_COUNT_NEGATIVE, 
				"The maximum threads count is negative");
		}
		
		if (maxThreadsCount == 0) {
			throw new StrongPasswordException(StrongPasswordException.MAX_THREADS_COUNT_ZERO, 
				"The maximum threads count cannot be equal to zero");
		}

		if (maxThreadsCount > MAX_THREADS_COUNT_UPPER_LIMIT) {
			throw new StrongPasswordException(StrongPasswordException.MAX_RESULTS_COUNT_EXCEEDS_UPPER_LIMIT, 
				String.format("The maximum threads count exceeds the maximum allowed value: actual=%d, max=%d", maxResultsCount, MAX_THREADS_COUNT_UPPER_LIMIT));
		}
	}
	
	/**
	 * Obtains the symbols used
	 * @return The sumbols used
	 */
	public String getSymbols() {
		return symbolCharacters;
	}

	/**
	 * Obtains the symbols used
	 * @param symbols The sumbols to use use
	 */
	public void setSymbols(Object symbols) {
		
		if (!(symbols instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.SYMBOLS_INVALID,
				"The symbols to set are invalid");
		}
		
		this.symbolCharacters = (String) symbols;
		
		if (this.symbolCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.SYMBOLS_EMPTY, 
				"The symbols to set are empty");
		}
		
		if (this.symbolCharacters.trim().length() > SYMBOLS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.SYMBOLS_LENGTH_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the symbols to set exceeds the maximum allowed: actual=%d, max=%d", 
						this.symbolCharacters.trim().length(), SYMBOLS_MAX_LENGTH));
		}
		
		validateMins();
	}
	
	/**
	 * Obtains the numbers 
	 * @param numbers The numbers
	 */
	public void setNumbers(Object numbers) {
		
		if (!(numbers instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.NUMBERS_INVALID,
				"The numbers to set are invalid");
		}
		
		this.numberCharacters = (String) numbers;
		
		if (this.numberCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.NUMBERS_EMPTY, 
				"The numbers to set are empty");
		}
		
		if (this.numberCharacters.trim().length() > NUMBERS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.NUMBERS_LENGTH_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the numbers to set exceeds the maximum allowed: actual=%d, max=%d", 
						this.numberCharacters.trim().length(), NUMBERS_MAX_LENGTH));
		}
		
		validateMins();
	}
	
	/**
	 * Obtains the numbers 
	 * @return The numbers
	 */
	public String getNumbers() {
		return numberCharacters;
	}
	
	/**
	 * Obtains the lowercase characters
	 * @param chars The lowercase characters
	 */
	public void setLowercaseCharacters(Object chars) {
		
		if (!(chars instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.LOWERCASE_CHARACTERE_INVALID,
				"The lowercase characters to set are invalid");
		}
		
		lowercaseCharacters = (String) chars;
		
		if (lowercaseCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.LOWERCASE_CHARACTERE_EMPTY, 
				"The lowercase characters to set are empty");
		}
		
		if (lowercaseCharacters.trim().length() > LOWERCASE_CHARACTERS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.LOWERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the lowercase characters to set exceeds the maximum allowed: actual=%d, max=%d", 
					lowercaseCharacters.trim().length(), LOWERCASE_CHARACTERS_MAX_LENGTH));
		}
		
		validateMins();
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
	public void setUppercaseCharacters(Object chars) {
		
		if (!(chars instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.UPPERCASE_CHARACTERE_INVALID,
				"The uppercase characters to set are invalid");
		}
		
		uppercaseCharacters = (String) chars;
		
		if (uppercaseCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.UPPERCASE_CHARACTERE_EMPTY, 
				"The uppercase characters to set are empty");
		}
		
		if (uppercaseCharacters.trim().length() > UPPERCASE_CHARACTERS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.UPPERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the uppercase characters to set exceeds the maximum allowed: actual=%d, max=%d", 
					uppercaseCharacters.trim().length(), UPPERCASE_CHARACTERS_MAX_LENGTH));
		}
		
		validateMins();
	}

	/**
	 * Obtains the uppercare characters
	 * @return The uppercase characters
	 */
	public String getUppercaseCharacters() {
		return uppercaseCharacters;
	}
	
	/**
	 * Obtains the similar characters
	 * @param chars The similar characters
	 */
	public void setSimilarCharacters(Object chars) {
		
		if (!(chars instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.SIMILAR_CHARACTERE_INVALID,
				"The similar characters to set are invalid");
		}
		
		similarCharacters = (String) chars;
		
		if (similarCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.SIMILAR_CHARACTERE_EMPTY, 
				"The similar characters to set are empty");
		}
		
		if (similarCharacters.trim().length() > SIMILAR_CHARACTERS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.SIMILAR_CHARACTERE_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the similar characters to set exceeds the maximum allowed: actual=%d, max=%d", 
					similarCharacters.trim().length(), UPPERCASE_CHARACTERS_MAX_LENGTH));
		}	
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
	public void setAmbigousCharacters(Object chars) {
		
		if (!(chars instanceof String)) {
			throw new StrongPasswordException(StrongPasswordException.AMBIGOUS_CHARACTERE_INVALID,
				"The ambigous characters to set are invalid");
		}
		
		ambigousCharacters = (String) chars;
		
		if (ambigousCharacters.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.AMBIGOUS_CHARACTERE_EMPTY, 
				"The ambigous characters to set are empty");
		}
		
		if (ambigousCharacters.trim().length() > AMBIGOUS_CHARACTERS_MAX_LENGTH) {
			throw new StrongPasswordException(StrongPasswordException.AMBIGOUS_CHARACTERE_EXCEEDS_UPPER_LIMIT, 
				String.format("The actual length of the ambigous characters to set exceeds the maximum allowed: actual=%d, max=%d", 
					ambigousCharacters.trim().length(), AMBIGOUS_CHARACTERS_MAX_LENGTH));
		}		
	}
	
	/**
	 * Obtains the ambigous characters
	 * @return The ambigous characters
	 */
	public String getAmbigousCharacters() {
		return ambigousCharacters;
	}

	
	private void validateMins() {
		
		int realLength =
			(shouldUseSymbols() ? minSymbolsCount : 0) +
			(shouldUseNumbers() ? minNumbersCount : 0) + 
			(shouldUseLowercaseCharacters() ? minLowercaseCharactersCount : 0) + 
			(shouldUseUppercaseCharacters() ? minUppercaseCharactersCount : 0);
		
		if (realLength > passwordLength) {
			throw new StrongPasswordException(StrongPasswordException.EXPECTED_MIN_LENGTH_GREATER_REQUIRED_LENGTH, 
				String.format("The expected minimum length of the password resulting from combining dictionaries exceeds the password length: actual length=%d, required length=%d", realLength, passwordLength));
		}
	}
}
