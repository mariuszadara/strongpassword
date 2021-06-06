package org.mariuszadara.strongpassword.api;

/**
 * This is definition for the strong password exception.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public class StrongPasswordException extends RuntimeException {

	private static final long serialVersionUID = 5072994089446341665L;

	/**
	 * Error code indicating the operation is not allowed
	 */
	public static final int OPERATION_NOT_ALLOWED = 1;
	
	/**
	 * General error code
	 */
	public static final int GENERAL_ERROR = 2;

	/**
	 * Error code indicating that the options file has not been specified
	 */
	public static final int OPTIONS_FILE_NOT_SPECIFIED = 3;
	/**
	 * Error code indicating that the options file has not been found
	 */
	public static final int OPTIONS_FILE_NOT_FOUND = 4;
	/**
	 * Error code indicating that options file is invalid
	 */
	public static final int OPTIONS_FILE_NOT_REGULAR_FILE = 5;
	/**
	 * Error code indicating that the options file is not readable
	 */
	public static final int OPTIONS_FILE_NOT_READABLE = 6;
	/**
	 * Error code indicating that the options file failed to load
	 */
	public static final int OPTIONS_FILE_LOADING_FAILED = 7;

	/**
	 * Error code indicating that the password length is invalid
	 */
	public static final int LENGTH_INVALID = 8;
	/**
	 * Error code indicating that the length is too small
	 */
	public static final int LENGTH_TOO_SMALL = 9;
	/**
	 * Error code indicating that the length is too high
	 */
	public static final int LENGTH_TOO_HIGH = 10;

	/**
	 * Error code indicating that the symbols count equals the length of the password
	 */
	public static final int SYMBOLS_EQUAL_LENGTH = 11;
	/**
	 * Error code indicating that the symbols count exceeds the length of the password
	 */
	public static final int SYMBOLS_EXCEEDING_LENGTH = 12;

	/**
	 * Error code indicating that the numbers count equals the length of the password
	 */
	public static final int NUMBERS_EQUAL_LENGTH = 13;
	/**
	 * Error code indicating that the numbers count exceeds the length of the password
	 */
	public static final int NUMBERS_EXCEEDING_LENGTH = 14;

	/**
	 * Error code indicating that the lowercase characters equals the length of the password
	 */
	public static final int LOWERCASE_CHARACTERS_EQUAL_LENGTH = 15;
	/**
	 * Error code indicating that the lowercase characters count exceeds the length of the password
	 */
	public static final int LOWERCASE_CHARACTERS_EXCEEDING_LENGTH = 16;

	/**
	 * Error code indicating that the uppercase characters equals the length of the password
	 */
	public static final int UPPERCASE_CHARACTERS_EQUAL_LENGTH = 17;
	/**
	 * Error code indicating that the uppercase characters count exceeds the length of the password
	 */	
	public static final int UPPERCASE_CHARACTERS_EXCEEDING_LENGTH = 18;

	/**
	 * Error code indicating that the maximum running time is invalid
	 */
	public static final int MAX_RUNNING_TIME_INVALID = 19;
	/**
	 * Error code indicating that the maximum running time is too high
	 */
	public static final int MAX_RUNNING_TIME_TOO_HIGH = 20;

	/**
	 * Error code indicating that the maximum results count is invalid
	 */
	public static final int MAX_RESULTS_INVALID = 21;
	/**
	 * Error code indicating that the maximum results count is too high
	 */
	public static final int MAX_RESULTS_TOO_HIGH = 22;

	/**
	 * Error code indicating that the maximum threads count is invalid
	 */
	public static final int MAX_THREADS_INVALID = 23;
	/**
	 * Error code indicating that the maximum threads count is too high
	 */
	public static final int MAX_THREADS_TOO_HIGHT = 24;

	/**
	 * Error code indicating that the generator has been interrupted
	 */
	public static final int GENERATOR_INTERRUPTED = 25;

	/**
	 * Error code indicating that the password to validate is invalid
	 */
	public static final int PASSWORD_TO_VALIDATE_IS_INVALID = 26;
	
	/**
	 * Error code indicating that the length determined by the minimum lengths of symbols, numbers, lower-case and upper-case characters
	 * exceeds the length of the password - in this case, no password will be generated since the minimum count will never be reached.
	 */
	public static final int EXPECTED_MIN_LENGTH_GREATER_REQUIRED_LENGTH = 27;
	
	/**
	 * Error code indicating the the actual length of the password resulting from combining the minimum symbols, number, lower-case and upper-case characters
	 * will be equal to zero, thus not returning any password at all.
	 */
	public static final int EXPECTED_LENGTH_IS_ZERO = 28;
	
	
	

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
