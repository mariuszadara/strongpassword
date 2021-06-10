package org.mariuszadara.strongpassword;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordEstimator;
import org.mariuszadara.strongpassword.api.StrongPasswordEstimatorFactory;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;

@RunWith(JUnit4.class)
@ThreadSafe
public class StrongPasswordEstimatorTest {

	private StrongPasswordEstimator estimator;

	@Before
	public void beforeTest() {
		estimator = StrongPasswordEstimatorFactory.make();
	}

	@Test
	public void testEstimate() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		Assert.assertTrue("Invalid decode time", estimator.estimateDecodeTime(options, "x-G}2U[dK5n8F~9m*0") > 0);
	}

	@Test(expected = StrongPasswordException.class)
	public void testEstimateInvalidOptions() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setPasswordLength(-1);
		estimator.estimateDecodeTime(options, "test");
	}

	@Test
	public void testEstimateInvalidPassword() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			estimator.estimateDecodeTime(options, null);
			Assert.fail();
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_TO_ESTIMATE_IS_INVALID, e.getCode());
		}
	}

	@Test
	public void testEstimateEmptyPassword() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			estimator.estimateDecodeTime(options, "");
			Assert.fail();
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_TO_ESTIMATE_IS_INVALID, e.getCode());
		}
	}
}
