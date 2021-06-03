package org.mariuszadara.strongpassword.api;

import org.mariuszadara.strongpassword.internal.StrongPasswordGeneratorImpl;

/**
 * This file contains the definition for the strong password generator.
 * It's main role is to obtain the default generator instance.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public final class StrongPasswordGeneratorFactory {

	private StrongPasswordGeneratorFactory() {
		// factory class
	}
	
	/**
	 * Obtains a new generator instance
	 * @return The generator instance
	 */
	public static StrongPasswordGenerator make() {
		return new StrongPasswordGeneratorImpl();
	}
}
