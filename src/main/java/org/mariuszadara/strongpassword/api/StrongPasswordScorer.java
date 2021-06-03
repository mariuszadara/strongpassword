package org.mariuszadara.strongpassword.api;

/**
 * Thie file contains the definition for the strong password scorer.
 * It's main role is to compute a score for a given password and the options used to generate it - the higher the score, the better the password.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public interface StrongPasswordScorer {

	/**
	 * Compute the score for the password using the given options.
	 * 
	 * @param options The options used to generate the password
	 * @param password The password to compute the score for
	 * @return The score of the password
	 */
	long computeScore(StrongPasswordOptions options, String password);
}
