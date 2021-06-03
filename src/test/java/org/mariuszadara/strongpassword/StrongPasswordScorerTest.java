package org.mariuszadara.strongpassword;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordScorerFactory;

@RunWith(JUnit4.class)
public class StrongPasswordScorerTest {

	@Test
	public void testEstimate() {
		Assert.assertTrue("", StrongPasswordScorerFactory.make().computeScore(new StrongPasswordOptions(), "x-G}2U[dK5n8F~9m*0") > 0);
	}
}
