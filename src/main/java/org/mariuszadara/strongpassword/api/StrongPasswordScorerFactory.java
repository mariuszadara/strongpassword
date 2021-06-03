package org.mariuszadara.strongpassword.api;

import org.mariuszadara.strongpassword.internal.StrongPasswordScorerImpl;

/**
 * This file contains the strong password scorer factory definition.
 * It's main role is to obtain the instance used by strong password generator.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public final class StrongPasswordScorerFactory {

	private StrongPasswordScorerFactory() {
		// factory class
	}

	/**
	 * Obtains the default password scorer instance
	 * @return The default instance
	 */
	public static synchronized StrongPasswordScorer make() {
		return new StrongPasswordScorerImpl();
	}
}
