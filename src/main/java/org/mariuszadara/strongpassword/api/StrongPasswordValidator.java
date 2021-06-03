package org.mariuszadara.strongpassword.api;

/**
 * This file contains the strong password validator definition.
 * It's main role is to validate a password candidate upon a set of options.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public interface StrongPasswordValidator {

	/**
	 * Checks if the password candidate is valid using the given options 
	 * @param options The options to use in validation
	 * @param candidate The password candidate to validate
	 * @return <code>true</code> if the candidate is valid, <code>false</code> otherwise
	 */
	boolean isValid(StrongPasswordOptions options, String candidate);
}
