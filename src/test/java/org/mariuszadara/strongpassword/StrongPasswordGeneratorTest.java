package org.mariuszadara.strongpassword;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordGenerator;
import org.mariuszadara.strongpassword.api.StrongPasswordGeneratorFactory;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;


@RunWith(JUnit4.class)
@ThreadSafe
public class StrongPasswordGeneratorTest {

	private StrongPasswordGenerator generator;
	
	@Before
	public void beforeTest() {
		generator = StrongPasswordGeneratorFactory.make();
	}
	
	@Test
	public void testGenerateWithDefault() throws Exception {
		var passwords = generator.generatePasswords(new StrongPasswordOptions());
		Assert.assertNotNull(passwords);
		Assert.assertFalse(passwords.isEmpty());
		Assert.assertFalse(passwords.size() > StrongPasswordOptions.DEFAULT_MAX_RESULTS_COUNT);
	}
	
	
	@Test(expected = StrongPasswordException.class)
	public void testGenerateFailIsOptionsInvalid() throws Exception {
		StrongPasswordOptions invalidOptions = new StrongPasswordOptions();
		invalidOptions.setLength(-1);
		generator.generatePasswords(invalidOptions);
	}
}
