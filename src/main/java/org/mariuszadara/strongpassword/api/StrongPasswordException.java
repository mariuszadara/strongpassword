package org.mariuszadara.strongpassword.api;

/**
 * This is definition for the strong password exception.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public class StrongPasswordException extends RuntimeException {

	private static final long serialVersionUID = 4913339686838916027L;

	/**
	 * This markers indicates that the exception is caused by bad input
	 */
	public static final int INPUT = 100;
	
	/**
	 * This markers indicates that the exception is caused by execution
	 */
	public static final int EXECUTION = 200;
	
	/**
	 * This code indicates that the specified password length is not a number
	 */
	public static final int PASSWORD_LENGTH_NOT_A_NUMBER = INPUT | 1;

	/**
	 * This code indicates that the specified password length is negative
	 */
	public static final int PASSWORD_LENGTH_NEGATIVE = INPUT | 2;
	
	/**
	 * This code indicates that the specified password length is below the minimum limit
	 */
	public static final int PASSWORD_LENGTH_BELOW_LOWER_LIMIT = INPUT | 3;
	
	/**
	 * This code indicates that the specified password length is above the maximum limit
	 */
	public static final int PASSWORD_LENGTH_ABOVE_UPPER_LIMIT = INPUT | 4;
	
	/**
	 * This code indicates that the specified minimum symbols count is not a number
	 */
	public static final int MIN_SYMBOLS_COUNT_NOT_A_NUMBER = INPUT | 5;
	
	/**
	 * This code indicates that the specified minimum symbols count is negative
	 */
	public static final int MIN_SYMBOLS_COUNT_NEGATIVE = INPUT | 6;
	
	/**
	 * This code indicates that the specified minimum symbols count is below the lower limit
	 */
	public static final int MIN_SYMBOLS_COUNT_BELOW_LOWER_LIMIT = INPUT | 7;
	
	/**
	 * This code indicates that the specified minimum symbols count equals the password length
	 */
	public static final int MIN_SYMBOLS_COUNT_EQUALS_PASSWORD_LENGTH = INPUT | 7;
	
	/**
	 * This code indicates that the specified minimum symbols count exceeds the password length
	 */
	public static final int MIN_SYMBOLS_COUNT_EXCEEDS_PASSWORD_LENGTH = INPUT | 8;
	
	/**
	 * This code indicates that the specified minimum numbers count is invalid
	 */
	public static final int MIN_NUMBERS_COUNT_NOT_A_NUMBER = INPUT | 9;
	
	/**
	 * This code indicates that the specified minimum numbers count is negative
	 */
	public static final int MIN_NUMBERS_COUNT_NEGATIVE = INPUT | 10;
	
	/**
	 * This code indicates that the specified minimum numbers count is below the lower limit
	 */
	public static final int MIN_NUMBERS_COUNT_BELOW_LOWER_LIMIT = INPUT | 11;
	
	/**
	 * This code indicates that the specified minimum symbols count equals the password length
	 */
	public static final int MIN_NUMBERS_COUNT_EQUALS_PASSWORD_LENGTH = 11;
	
	/**
	 * This code indicates that the specified minimum symbols count exceeds the password length
	 */
	public static final int MIN_NUMBERS_COUNT_EXCEEDS_PASSWORD_LENGTH = INPUT | 12;
	
	/**
	 * This code indicates that the specified minimum lowercase symbols count is invalid
	 */
	public static final int MIN_LOWERCASE_CHARACTERS_COUNT_NOT_A_NUMBER = INPUT | 13;
	
	/**
	 * This code indicates that the specified minimum lowercase symbols count is negative
	 */
	public static final int MIN_LOWERCASE_CHARACTERS_NEGATIVE = INPUT | 14;
	
	/**
	 * This code indicates that the specified minimum lowercase symbols count is below the lower limit
	 */
	public static final int MIN_LOWERCASE_CHARACTERS_BELOW_LOWER_LIMIT = INPUT | 15;
	
	/**
	 * This code indicates that the specified minimum lowercase symbols count equals the password length
	 */
	public static final int MIN_LOWERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH = 16;
	
	/**
	 * This code indicates that the specified minimum lowercase symbols count is exceeds the password length
	 */
	public static final int MIN_LOWERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH = INPUT | 17;

	/**
	 * This code indicates that the specified minimum uppercase symbols count is invalid
	 */
	public static final int MIN_UPPERCASE_CHARACTERS_COUNT_NOT_A_NUMBER = INPUT | 18;
	
	/**
	 * This code indicates that the specified minimum uppercase symbols count is negative
	 */
	public static final int MIN_UPPERCASE_CHARACTERS_NEGATIVE = INPUT | 19;

	/**
	 * This code indicates that the specified minimum uppercase symbols count is below the lower limit
	 */
	public static final int MIN_UPPERCASE_CHARACTERS_BELOW_LOWER_LIMIT = INPUT | 20;

	/**
	 * This code indicates that the specified minimum uppercase symbols count equals the password length
	 */
	public static final int MIN_UPPERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH = 21;

	/**
	 * This code indicates that the specified minimum uppercase symbols count exceeds the password length
	 */
	public static final int MIN_UPPERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH = INPUT | 22;

	/**
	 * This code indicates that the specified flag for exclude similar characters is invalid
	 */
	public static final int EXCLUDE_SIMILAR_CHARACTERS_FLAG_INVALID = INPUT | 23;

	/**
	 * This code indicates that the specified flag for exclude ambigous characters is invalid
	 */
	public static final int EXCLUDE_AMBIGOUS_CHARACTERS_FLAG_INVALID = INPUT | 24;
	
	/**
	 * This code indicates that the maximum running time is invalid
	 */
	public static final int MAX_RUNNING_TIME_NOT_A_NUMBER = INPUT | 25;

	/**
	 * This code indicates that the maximum running time is negative
	 */
	public static final int MAX_RUNNING_TIME_NEGATIVE = INPUT | 26;

	/**
	 * This code indicates that the maximum running time is zero
	 */
	public static final int MAX_RUNNING_TIME_ZERO = INPUT | 27;
	
	/**
	 * This code indicates that the maximum running time exceeds the maximum limit
	 */
	public static final int MAX_RUNNING_TIME_EXCEEDS_UPPER_LIMIT = INPUT | 28;
	
	/**
	 * This code indicates that the maximum results count is invalid
	 */
	public static final int MAX_RESULTS_COUNT_NOT_A_NUMBER = INPUT | 29;
	
	/**
	 * This code indicates that the maximum results count is negative
	 */
	public static final int MAX_RESULTS_COUNT_NEGATIVE = INPUT | 30;
	
	/**
	 * This code indicates that the maximum results count is zero
	 */
	public static final int MAX_RESULTS_COUNT_ZERO = INPUT | 31;
	
	/**
	 * This code indicates that the maximum results count exceeds the maximum limit
	 */
	public static final int MAX_RESULTS_COUNT_EXCEEDS_UPPER_LIMIT = INPUT | 32;
	
	/**
	 * This code indicates that the maximum results count is invalid
	 */
	public static final int MAX_THREADS_COUNT_NOT_A_NUMBER = INPUT | 33;
	
	/**
	 * This code indicates that the maximum results count is negative
	 */
	public static final int MAX_THREADS_COUNT_NEGATIVE = INPUT | 34;
	
	/**
	 * This code indicates that the maximum results count is zero
	 */
	public static final int MAX_THREADS_COUNT_ZERO = INPUT | 35;
	
	/**
	 * This code indicates that the maximum results count exceeds the maximum limit
	 */
	public static final int MAX_THREADS_COUNT_EXCEEDS_UPPER_LIMIT = INPUT | 36;
	
	/**
	 * This code indicates that the symbols dictionary is invalid
	 */
	public static final int SYMBOLS_INVALID = INPUT | 37;
	
	/**
	 * This code indicates that the symbols dictionary is empty
	 */
	public static final int SYMBOLS_EMPTY = INPUT | 38;
	
	/**
	 * This code indicates that the symbols dictionary length exceeds the maximum limit
	 */
	public static final int SYMBOLS_LENGTH_EXCEEDS_UPPER_LIMIT = INPUT | 39;

	/**
	 * This code indicates that the numbers dictionary is invalid
	 */
	public static final int NUMBERS_INVALID = INPUT | 40;

	/**
	 * This code indicates that the numbers dictionary is empty
	 */
	public static final int NUMBERS_EMPTY = INPUT | 41;
	
	/**
	 * This code indicates that the numbers dictionary is invalid
	 */
	public static final int NUMBERS_LENGTH_EXCEEDS_UPPER_LIMIT = INPUT | 42;
	
	/**
	 * This code indicates that the lowercase characters dictionary is invalid
	 */
	public static final int LOWERCASE_CHARACTERE_INVALID = INPUT | 43;
	
	/**
	 * This code indicates that the lowercase characters dictionary is empty
	 */
	public static final int LOWERCASE_CHARACTERE_EMPTY = INPUT | 44;
	
	/**
	 * This code indicates that the lowercase characters dictionary length exceeds the maximum limit
	 */
	public static final int LOWERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT = INPUT | 45;
	
	/**
	 * This code indicates that the uppercase characters dictionary is invalid
	 */
	public static final int UPPERCASE_CHARACTERE_INVALID = INPUT | 46;
	
	/**
	 * This code indicates that the uppercase characters dictionary is empty
	 */
	public static final int UPPERCASE_CHARACTERE_EMPTY = INPUT | 47;
	
	/**
	 * This code indicates that the uppercase characters dictionary length exceeds the maximum limit
	 */
	public static final int UPPERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT = INPUT | 48;
	
	/**
	 * This code indicates that the similar characters dictionary is invalid
	 */
	public static final int SIMILAR_CHARACTERE_INVALID = INPUT | 49;
	
	/**
	 * This code indicates that the similar characters dictionary is empty
	 */
	public static final int SIMILAR_CHARACTERE_EMPTY = INPUT | 50;
	
	/**
	 * This code indicates that the similar characters dictionary length exceeds the maximum limit
	 */
	public static final int SIMILAR_CHARACTERE_EXCEEDS_UPPER_LIMIT = INPUT | 51;
	
	/**
	 * This code indicates that the ambigous characters dictionary is invalid
	 */
	public static final int AMBIGOUS_CHARACTERE_INVALID = INPUT | 52;
	
	/**
	 * This code indicates that the ambigous characters dictionary is invalid
	 */
	public static final int AMBIGOUS_CHARACTERE_EMPTY = INPUT | 53;
	
	/**
	 * This code indicates that the ambigous characters dictionary length exceeds the maximum limit
	 */
	public static final int AMBIGOUS_CHARACTERE_EXCEEDS_UPPER_LIMIT = INPUT | 54;
	
	/**
	 * Error code indicating that the length determined by the minimum lengths of symbols, numbers, lower-case and upper-case characters
	 * exceeds the length of the password - in this case, no password will be generated since the minimum count will never be reached.
	 */
	public static final int EXPECTED_MIN_LENGTH_GREATER_REQUIRED_LENGTH = INPUT | 55;

	/**
	 * Error code indicating that the options file has not been specified
	 */
	public static final int OPTIONS_FILE_NOT_SPECIFIED = INPUT | 56;
	
	/**
	 * Error code indicating that the options file has not been found
	 */
	public static final int OPTIONS_FILE_NOT_FOUND = INPUT | 57;
	
	/**
	 * Error code indicating that options file is invalid
	 */
	public static final int OPTIONS_FILE_NOT_REGULAR_FILE = INPUT | 58;
	
	/**
	 * Error code indicating that the options file is not readable
	 */
	public static final int OPTIONS_FILE_NOT_READABLE = INPUT | 59;
	
	/**
	 * Error code indicating that the options file failed to load
	 */
	public static final int OPTIONS_FILE_LOADING_FAILED = INPUT | 60;
	
	/**
	 * Error code indicate that password used to estimate the decode time is invalid
	 */
	public static final int PASSWORD_TO_ESTIMATE_IS_INVALID = INPUT | 61;
	
	/**
	 * General error code
	 */
	public static final int GENERAL_ERROR = EXECUTION | 2;

	/**
	 * Error code indicating that the generator execution has been interrupted
	 */
	public static final int GENERATOR_INTERRUPTED = EXECUTION | 3;
	
	
	/**
	 * Field containg the current exception error code
	 */
	private final int code;

	/**
	 * Constructor
	 * @param code The code of the exception
	 * @param message The message of the exception
	 * @param cause The cause of the exception
	 */
	public StrongPasswordException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	/**
	 * Constructor without a cause
	 * @param code The code of the exception
	 * @param message The message of the exception
	 */
	public StrongPasswordException(int code, String message) {
		this(code, message, null);
	}

	/**
	 * Constructor using a code and a cause
	 * @param code The code of the exception
	 * @param cause The cause of the exception
	 */
	public StrongPasswordException(int code, Throwable cause) {
		this(code, cause != null ? cause.getMessage() : null, cause);
	}

	/**
	 * Constructor using the code
	 * @param code The code of the exception
	 */
	public StrongPasswordException(int code) {
		this(code, (String) null);
	}

	/**
	 * Obtains the code of the exception
	 * @return The code of the exception
	 */
	public int getCode() {
		return code;
	}
}
