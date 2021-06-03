
package org.mariuszadara.strongpassword.api;

import java.util.List;

/**
 * This file contains the definitions for the strong password generator.
 * It's main role is to generate a list of passwords based on some options.
 * 
 * @author mariuszadara
 * @since 1.0.0
 */
public interface StrongPasswordGenerator {

	/**
	 * Generates a list of passwords using the given options
	 * @param options The options to use when generating passwords
	 * @return the list of generated passwords
	 */
	List<String> generatePasswords(StrongPasswordOptions options);
}
