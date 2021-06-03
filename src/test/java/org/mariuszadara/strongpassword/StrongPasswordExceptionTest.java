package org.mariuszadara.strongpassword;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordException;

@RunWith(JUnit4.class)
@ThreadSafe
public class StrongPasswordExceptionTest {

	@Test
	public void testCode() {
		
		StrongPasswordException exception = new StrongPasswordException(1);
		Assert.assertEquals(1, exception.getCode());
		
		exception = new StrongPasswordException(1, "test");
		Assert.assertEquals(1, exception.getCode());
		
		exception = new StrongPasswordException(1, "test", new Exception());
		Assert.assertEquals(1, exception.getCode());
		
		exception = new StrongPasswordException(1, new Exception());
		Assert.assertEquals(1, exception.getCode());
	}
	
	
	@Test
	public void testMessage() {
		
		StrongPasswordException exception = new StrongPasswordException(1);
		Assert.assertNull(exception.getMessage());
		
		exception = new StrongPasswordException(1, "test");
		Assert.assertEquals("test", exception.getMessage());
		
		exception = new StrongPasswordException(1, "test", new Exception());
		Assert.assertEquals("test", exception.getMessage());
	}

	
	@Test
	public void testCause() {
		
		StrongPasswordException exception = new StrongPasswordException(1);
		Assert.assertNull(exception.getCause());
		
		exception = new StrongPasswordException(1, "test");
		Assert.assertNull(exception.getCause());
		
		Exception cause = new Exception();
		
		exception = new StrongPasswordException(1, "test", cause);
		Assert.assertEquals(cause, exception.getCause());
		
		exception = new StrongPasswordException(1, cause);
		Assert.assertEquals(cause, exception.getCause());
	}
}
