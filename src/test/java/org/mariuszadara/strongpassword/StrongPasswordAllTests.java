package org.mariuszadara.strongpassword;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
	StrongPasswordEstimatorTest.class,
	StrongPasswordExceptionTest.class,
	StrongPasswordGeneratorTest.class,
	StrongPasswordOptionsTest.class,
	StrongPasswordScorerTest.class,
	StrongPasswordValidatorTest.class
})
public class StrongPasswordAllTests {

}
