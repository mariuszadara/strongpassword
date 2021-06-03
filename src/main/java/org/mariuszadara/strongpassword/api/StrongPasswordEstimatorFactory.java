package org.mariuszadara.strongpassword.api;

import org.mariuszadara.strongpassword.internal.StrongPasswordEstimatorImpl;

/**
 * This is the definition for the factory used to obtains a {@link StrongPasswordEstimator} instance.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public final class StrongPasswordEstimatorFactory {

	private StrongPasswordEstimatorFactory() {
		// factory class
	}

	/**
	 * Obtains the default estimator instance
	 * @return The default estimator instance
	 */
	public static synchronized StrongPasswordEstimator make() {
		return new StrongPasswordEstimatorImpl();
	}
}
