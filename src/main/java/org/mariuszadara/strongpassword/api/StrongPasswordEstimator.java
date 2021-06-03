package org.mariuszadara.strongpassword.api;

/**
 * This definition provides basic functionality for an password decode time estimator.
 * The main role for it is to estimate the decode time for a generated password based on the options used to generate that password.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public interface StrongPasswordEstimator {

	/**
	 * Estimate the decode time for the given password using the provided options.
	 * @param options The options used to generate the password
	 * @param password The password
	 * @return The estimated time in milliseconds used to decode the given password
	 */
	double estimateDecodeTime(StrongPasswordOptions options, String password);
}
