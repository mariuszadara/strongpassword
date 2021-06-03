package org.mariuszadara.strongpassword.api;

import org.mariuszadara.strongpassword.internal.StrongPasswordValidatorImpl;

/**
 * This file contains the strong password validator factory.
 * It's role is to obtain the validator instance used by the strong password generator.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public final class StrongPasswordValidatorFactory {

	private StrongPasswordValidatorFactory() {
		// factory class
	}

	/**
	 * Obtains the default validator 
	 * @return The default validator
	 */
	public static synchronized StrongPasswordValidator make() {
		return new StrongPasswordValidatorImpl();
	}
}
