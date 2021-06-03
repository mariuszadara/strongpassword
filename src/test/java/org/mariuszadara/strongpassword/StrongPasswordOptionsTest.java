package org.mariuszadara.strongpassword;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordFileOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;

@RunWith(JUnit4.class)
@ThreadSafe
public class StrongPasswordOptionsTest {

	@Test
	public void testValidateLengthNegative() {

		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(-1);

		try {
			options.validate();
			fail("Negative length not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LENGTH_INVALID, e.getCode());
		}
	}

	@Test
	public void testValidateLengthZero() {

		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(0);

		try {
			options.validate();
			fail("Zero length not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LENGTH_INVALID, e.getCode());
		}
	}

	@Test
	public void testValidateLengthBelowMin() {

		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(3);
		
		try {
			options.validate();
			fail("Length below minimum not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LENGTH_TOO_SMALL, e.getCode());
		}
	}

	@Test
	public void testValidateLengthAboveMax() {

		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(50);

		try {
			options.validate();
			fail("Length above maximum not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LENGTH_TOO_HIGH, e.getCode());
		}
	}
	
	@Test
	public void testValidateSymbolsEqualLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinSymbolsCount(10);

		try {
			options.validate();
			fail("Minimum symbols count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_EQUAL_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateSymbolsExceedingLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinSymbolsCount(11);
		
		try {
			options.validate();
			fail("Exceeding symbols count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_EXCEEDING_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateNumbersEqualLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinNumbersCount(10);
		
		try {
			options.validate();
			fail("Minimum numbers count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_EQUAL_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateNumbersExceedingLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinNumbersCount(11);
		
		try {
			options.validate();
			fail("Exceeding numbers count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_EXCEEDING_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateLowercaseCharactersEqualLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinLowercaseCharactersCount(10);
		
		try {
			options.validate();
			fail("Minimum lowercase characters count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERS_EQUAL_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateLowercaseCharactersExceedingLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinLowercaseCharactersCount(11);
		
		try {
			options.validate();
			fail("Minimum lowercase characters count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERS_EXCEEDING_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateUppercaseCharactersEqualLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinUppercaseCharactersCount(10);
		
		try {
			options.validate();
			fail("Minimum uppercase characters count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERS_EQUAL_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateUppercaseCharactersExceedingLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(10);
		options.setMinUppercaseCharactersCount(11);
		
		try {
			options.validate();
			fail("Minimum uppercase characters count not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERS_EXCEEDING_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxRunningTimeNegative() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxRunningTime(-1);
		
		try {
			options.validate();
			fail("Negative maximum running time not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RUNNING_TIME_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxRunningTimeZero() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxRunningTime(0);
		
		try {
			options.validate();
			fail("Zerp maximum running time not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RUNNING_TIME_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxRunningTimeTooHigh() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxRunningTime(StrongPasswordOptions.MAX_RUNNING_TIME_LIMIT + 1);
		
		try {
			options.validate();
			fail("Exceeding maximum running time not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RUNNING_TIME_TOO_HIGH, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxResultsNegative() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxResultsCount(-1);
		
		try {
			options.validate();
			fail("Negative max results not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxResultsZero() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxResultsCount(0);
		
		try {
			options.validate();
			fail("Zero max results not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxResultsExceedingLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxResultsCount(StrongPasswordOptions.MAX_RESULTS_LIMIT + 1);
		
		try {
			options.validate();
			fail("Exceeding max results not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_TOO_HIGH, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxThreadsNegative() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setThreadsCount(-1);
		
		try {
			options.validate();
			fail("Negative max threads not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxThreadsZero() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setThreadsCount(0);
		
		try {
			options.validate();
			fail("Zero max threads not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_INVALID, e.getCode());
		}
	}
	
	@Test
	public void testValidateMaxThreadsExceeding() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setThreadsCount(999);
		
		try {
			options.validate();
			fail("Exceeding max threads not validated");
		} catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_TOO_HIGHT, e.getCode());
		}
	}
	
	@Test
	public void testBindLength() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLength(expected);
		
		Assert.assertEquals("Length not bound correctly", expected, options.getLength());
	}
	
	@Test
	public void testBindMinSymbols() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinSymbolsCount(expected);
		
		Assert.assertEquals("Min symbols not bound correctly", expected, options.getMinSymbolsCount());
	}
	
	@Test
	public void testBindMinNumbers() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinNumbersCount(expected);
		
		Assert.assertEquals("Min numbers not bound correctly", expected, options.getMinNumbersCount());
	}
	
	@Test
	public void testBindMinLowercaseCharacters() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinLowercaseCharactersCount(expected);
		
		Assert.assertEquals("Min lowercase characters not bound correctly", expected, options.getMinLowercaseCharactersCount());
	}
	
	@Test
	public void testBindMinUppercaseCharacters() {
		
		final int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinUppercaseCharactersCount(expected);
		
		Assert.assertEquals("Min lowercase characters not bound correctly", expected, options.getMinUppercaseCharactersCount());
	}
	
	@Test
	public void testBindExcludeSimilarCharacters() {
		
		boolean expected = true;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setExcludeSimilarCharacters(expected);;
		
		Assert.assertEquals("Exclude similar characters not bound correctly", expected, options.excludeSimilarCharacters());
	}
	
	@Test
	public void testBindExcludeAmbigousCharacters() {
		
		boolean expected = true;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setExcludeAmbigousCharacters(expected);
		
		Assert.assertEquals("Exclude ambigous characters not bound correctly", expected, options.excludeAmbigousCharacters());
	}
	
	@Test
	public void testBindMaxRunningTime() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxRunningTime(expected);
		
		Assert.assertEquals("Max running time not bound correctly", expected, options.getMaxRunningTime());
	}
	
	@Test
	public void testBindMaxResults() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxResultsCount(expected);
		
		Assert.assertEquals("Max results not bound correctly", expected, options.getMaxResultsCount());
	}
	
	@Test
	public void testBindThreadsCount() {
		
		int expected = 1;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setThreadsCount(expected);
		
		Assert.assertEquals("Max threads count not bound correctly", expected, options.getThreadsCount());
	}
	
	@Test
	public void testBindSymbols() {
		
		var expected = "test";
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setSymbols(expected);
		
		Assert.assertEquals("Symbols not bound correctly", expected, options.getSymbols());
	}
	
	@Test
	public void testBindNumbers() {
		
		var expected = "test";
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setNumbers(expected);
		
		Assert.assertEquals("Numbers not bound correctly", expected, options.getNumbers());
	}
	
	@Test
	public void testBindLowercaseCharacters() {
		
		var expected = "test";
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLowercaseCharacters(expected);
		
		Assert.assertEquals("Lowercase characters not bound correctly", expected, options.getLowercaseCharacters());
	}
	
	@Test
	public void testBindUppercaseCharacters() {
		
		String expected = "test";;
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setUppercaseCharacters(expected);
		
		Assert.assertEquals("Uppercase characters not bound correctly", expected, options.getUppercaseCharacters());
	}
	
	@Test
	public void testBindSimilarCharacters() {
		
		String expected = "test";
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setSimilarCharacters(expected);
		
		Assert.assertEquals("Similar characters not bound correctly", expected, options.getSimilarCharacters());
	}
	
	@Test
	public void testBindAmbigousCharacters() {
		
		String expected = "test";  
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setAmbigousCharacters(expected);
		
		Assert.assertEquals("Ambigous characters not bound correctly", expected, options.getAmbigousCharacters());
	}
	
	@Test
	public void testDefaultOptionsAreValid() {
		new StrongPasswordOptions().validate();
	}
	
	@Test
	public void testFileOptionsInvalidFile() {
		try {
			new StrongPasswordFileOptions(null);
			fail("Invalid file not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.OPTIONS_FILE_NOT_SPECIFIED, e.getCode());
		}
	}
	
	@Test
	public void testFileOptionsFileNotFound() {
		try {
			new StrongPasswordFileOptions(new File("test"));
			fail("Not found file not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.OPTIONS_FILE_NOT_FOUND, e.getCode());
		}
	}
	
	@Test
	public void testFileOptionsFileIsFolder() throws Exception {
		File tempFolder = null;
		try {
			tempFolder = Files.createTempDirectory("strongPassword").toFile();
			new StrongPasswordFileOptions(new File("test"));
			fail("Not found file not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.OPTIONS_FILE_NOT_FOUND, e.getCode());
		}
		finally {
			if (tempFolder != null && !tempFolder.delete()) {
				tempFolder.deleteOnExit();
			}
		}
	}
}
