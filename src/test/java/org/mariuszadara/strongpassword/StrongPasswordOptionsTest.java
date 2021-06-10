package org.mariuszadara.strongpassword;

import static org.junit.Assert.fail;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.junit.runners.JUnit4;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordFileOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordMapOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;

@RunWith(JUnit4.class)
@ThreadSafe
public class StrongPasswordOptionsTest {

	@Test
	public void testSetPasswordLengthNull() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setPasswordLength(null);
			Assert.fail("Null not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_LENGTH_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetPasswordLengthNegative() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setPasswordLength(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_LENGTH_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetPasswordLengthBelowLowerLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setPasswordLength(3);
			Assert.fail("Value below lower limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_LENGTH_BELOW_LOWER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testSetPasswordLengthAboveUpperLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setPasswordLength(50);
			Assert.fail("Value above upper limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.PASSWORD_LENGTH_ABOVE_UPPER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testGetPasswordLength() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setPasswordLength(23);
		Assert.assertEquals(23, options.getPasswordLength());
	}
	
	@Test
	public void testSetMinSymbolsCountNull() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinSymbolsCount(null);
			Assert.fail("Null not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_SYMBOLS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetMinSymbolsCountNegative() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinSymbolsCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_SYMBOLS_COUNT_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetMinSymbolsCountBelowLowerLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinSymbolsCount(1);
			Assert.fail("Value below lower limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_SYMBOLS_COUNT_BELOW_LOWER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testSetMinSymbolsCountEqualsPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinSymbolsCount(options.getPasswordLength());
			Assert.fail("Value equal to password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_SYMBOLS_COUNT_EQUALS_PASSWORD_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testSetMinSymbolsCountOverPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinSymbolsCount(options.getPasswordLength() + 1);
			Assert.fail("Value above the password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_SYMBOLS_COUNT_EXCEEDS_PASSWORD_LENGTH, e.getCode());
		}
	}
		
	@Test
	public void testGetMinSymbolsCount() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinSymbolsCount(3);
		Assert.assertEquals(3, options.getMinSymbolsCount());
	}
	
	@Test
	public void testSetMinNumbersCountNull() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinNumbersCount(null);
			Assert.fail("Null not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_NUMBERS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetMinNumbersCountNegative() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinNumbersCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_NUMBERS_COUNT_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetMinNumbersCountBelowLowerLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinNumbersCount(1);
			Assert.fail("Value below lower limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_NUMBERS_COUNT_BELOW_LOWER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testSetMinNumbersCountEqualsPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinNumbersCount(options.getPasswordLength());
			Assert.fail("Value equal to password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_NUMBERS_COUNT_EQUALS_PASSWORD_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testSetMinNumbersCountOverPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinNumbersCount(options.getPasswordLength() + 1);
			Assert.fail("Value above the password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_NUMBERS_COUNT_EXCEEDS_PASSWORD_LENGTH, e.getCode());
		}
	}
		
	@Test
	public void testGetMinNumbersCount() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinNumbersCount(3);
		Assert.assertEquals(3, options.getMinNumbersCount());
	}
	
	@Test
	public void testMinLowercaseCharactersCountNull() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinLowercaseCharactersCount(null);
			Assert.fail("Null not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetMinLowercaseCharactersCountNegative() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinLowercaseCharactersCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetMinLowercaseCharactersCountBelowLowerLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinLowercaseCharactersCount(1);
			Assert.fail("Value below lower limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_BELOW_LOWER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testSetMinLowercaseCharactersCountEqualsPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinLowercaseCharactersCount(options.getPasswordLength());
			Assert.fail("Value equal to password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testSetMinLowercaseCharactersCountOverPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinLowercaseCharactersCount(options.getPasswordLength() + 1);
			Assert.fail("Value above the password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_LOWERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH, e.getCode());
		}
	}
		
	@Test
	public void testGetMinLowercaseCharactersCount() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinLowercaseCharactersCount(3);
		Assert.assertEquals(3, options.getMinLowercaseCharactersCount());
	}
	
	@Test
	public void testSetExcludeSimilarCharactersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setExcludeSimilarCharacters(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.EXCLUDE_SIMILAR_CHARACTERS_FLAG_INVALID, e.getCode());
		}		
	}
	
	@Test
	public void testSetExcludeSimilarCharactersInvalid() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setExcludeSimilarCharacters(3);
			Assert.fail("Invalid value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.EXCLUDE_SIMILAR_CHARACTERS_FLAG_INVALID, e.getCode());
		}		
	}
	
	@Test
	public void testGetExcludeSimilarCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setExcludeSimilarCharacters(true);
		Assert.assertTrue(options.shouldExcludeSimilarCharacters());
	}
	
	@Test
	public void testSetExcludeAmbigousCharactersInvalid() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setExcludeAmbigousCharacters(3);
			Assert.fail("Invalid value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.EXCLUDE_AMBIGOUS_CHARACTERS_FLAG_INVALID, e.getCode());
		}		
	}
	
	@Test
	public void testGetExcludeAmbigousCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setExcludeAmbigousCharacters(true);
		Assert.assertTrue(options.shouldExcludeAmbigousCharacters());
	}
	
	@Test
	public void testMaxResultsCountNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMaxResultsCount(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testMaxResultsCountNegative() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMaxResultsCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_COUNT_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testMaxResultsCountZero() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMaxResultsCount(0);
			Assert.fail("Zero value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_COUNT_ZERO, e.getCode());
		}
	}
	
	@Test
	public void testMaxResultsOverLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMaxResultsCount(20);
			Assert.fail("Value above max limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_COUNT_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testGetMaxResults() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMaxResultsCount(5);
		Assert.assertEquals(5, options.getMaxResultsCount());
	}
	
	@Test
	public void testSetThreadsCountNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setThreadsCount(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetThreadsCountNegative() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setThreadsCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_COUNT_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetThreadsCountZero() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setThreadsCount(0);
			Assert.fail("Zero value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_THREADS_COUNT_ZERO, e.getCode());
		}
	}
	
	@Test
	public void testSetThreadsCountOverLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setThreadsCount(20);
			Assert.fail("Value above max limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MAX_RESULTS_COUNT_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testGetThreadsCount() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setThreadsCount(2);
		Assert.assertEquals(2, options.getThreadsCount());
	}
	
	@Test
	public void testSetSymbolsNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSymbols(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetSymbolsEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSymbols("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetSymbolsEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSymbols(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetSymbolsLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setSymbols(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SYMBOLS_LENGTH_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testGetSymbols() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setSymbols("test");
		Assert.assertEquals("test", options.getSymbols());
	}

	@Test
	public void testSetNumbersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setNumbers(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetNumbersEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setNumbers("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetNumbersEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setNumbers(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetNumbersLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setNumbers(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.NUMBERS_LENGTH_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}

	@Test
	public void testGetNumbers() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setNumbers("test");
		Assert.assertEquals("test", options.getNumbers());
	}

	@Test
	public void testSetLowercaseCharactersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setLowercaseCharacters(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERE_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetLowercaseCharactersEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setLowercaseCharacters("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetLowercaseCharactersEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setLowercaseCharacters(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetLowercaseCharactersLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setLowercaseCharacters(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.LOWERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}

	@Test
	public void testGetLowercaseCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setLowercaseCharacters("test");
		Assert.assertEquals("test", options.getLowercaseCharacters());
	}
	
	@Test
	public void testSetUppercaseCharactersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setUppercaseCharacters(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERE_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetUppercaseCharactersEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setUppercaseCharacters("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetUppercaseCharactersEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setUppercaseCharacters(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetUppercaseCharactersLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setUppercaseCharacters(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.UPPERCASE_CHARACTERE_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}

	@Test
	public void testGetUppercaseCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setUppercaseCharacters("test");
		Assert.assertEquals("test", options.getUppercaseCharacters());
	}
	
	@Test
	public void testSetSimilarCharactersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSimilarCharacters(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SIMILAR_CHARACTERE_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetSimilarCharactersEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSimilarCharacters("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SIMILAR_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetSimilarCharactersEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setSimilarCharacters(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SIMILAR_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetSimilarCharactersLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setSimilarCharacters(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.SIMILAR_CHARACTERE_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}

	@Test
	public void testGetSimilarCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setSimilarCharacters("test");
		Assert.assertEquals("test", options.getSimilarCharacters());
	}
	
	@Test
	public void testSetAmbigousCharactersNull() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setAmbigousCharacters(null);
			Assert.fail("Null value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.AMBIGOUS_CHARACTERE_INVALID, e.getCode());
		}
	}

	@Test
	public void testSetAmbigousCharactersEmpty1() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setAmbigousCharacters("");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.AMBIGOUS_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetAmbigousCharactersEmpty2() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setAmbigousCharacters(" ");
			Assert.fail("Empty value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.AMBIGOUS_CHARACTERE_EMPTY, e.getCode());
		}
	}
	
	@Test
	public void testSetAmbigousCharactersLengthOverUpperLimit() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			char[] chars = new char[300];
			Arrays.fill(chars, 'x');
			options.setAmbigousCharacters(new String(chars));
			Assert.fail("Value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.AMBIGOUS_CHARACTERE_EXCEEDS_UPPER_LIMIT, e.getCode());
		}
	}

	@Test
	public void testGetAmbigousCharacters() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setAmbigousCharacters("test");
		Assert.assertEquals("test", options.getAmbigousCharacters());
	}	
	
	@Test
	public void testMinUppercaseCharactersCountNull() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinUppercaseCharactersCount(null);
			Assert.fail("Null not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_COUNT_NOT_A_NUMBER, e.getCode());
		}
	}

	@Test
	public void testSetMinUppercaseCharactersCountNegative() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinUppercaseCharactersCount(-1);
			Assert.fail("Negative value not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_NEGATIVE, e.getCode());
		}
	}
	
	@Test
	public void testSetMinUppercaseCharactersCountBelowLowerLimit() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinUppercaseCharactersCount(1);
			Assert.fail("Value below lower limit not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_BELOW_LOWER_LIMIT, e.getCode());
		}
	}
	
	@Test
	public void testSetMinUppercaseCharactersCountEqualsPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinUppercaseCharactersCount(options.getPasswordLength());
			Assert.fail("Value equal to password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_EQUALS_PASSWORD_LENGTH, e.getCode());
		}
	}
	
	@Test
	public void testSetMinUppercaseCharactersCountOverPasswordLength() throws Exception {
		StrongPasswordOptions options = new StrongPasswordOptions();
		try {
			options.setMinUppercaseCharactersCount(options.getPasswordLength() + 1);
			Assert.fail("Value above the password length not handled");
		}
		catch (StrongPasswordException e) {
			Assert.assertEquals(StrongPasswordException.MIN_UPPERCASE_CHARACTERS_EXCEEDS_PASSWORD_LENGTH, e.getCode());
		}
	}
		
	@Test
	public void testGetMinUppercaseCharactersCount() {
		StrongPasswordOptions options = new StrongPasswordOptions();
		options.setMinUppercaseCharactersCount(3);
		Assert.assertEquals(3, options.getMinUppercaseCharactersCount());
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
	
	@Test
	public void testSetPasswordLengthMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.PASSWORD_LENGTH_KEY, 23);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(23, options.getPasswordLength());
	}
	
	
	@Test
	public void testSetMinSymbolsCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MIN_SYMBOLS_COUNT_KEY, 3);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(3, options.getMinSymbolsCount());
	}
	
	@Test
	public void testSetMinNumbersCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MIN_NUMBERS_COUNT_KEY, 3);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(3, options.getMinNumbersCount());
	}
	
	@Test
	public void testSetMinLowercaseCharactersCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MIN_LOWERCASE_CHARACTERS_COUNT_KEY, 3);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(3, options.getMinLowercaseCharactersCount());
	}
	
	@Test
	public void testSetMinUppercaseCharactersCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MIN_UPPERCASE_CHARACTERS_COUNT_KEY, 3);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(3, options.getMinUppercaseCharactersCount());
	}

	@Test
	public void testSetExcludeSimilarCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.EXCLUDE_SIMILAR_CHARACTERS_KEY, true);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertTrue(options.shouldExcludeSimilarCharacters());
	}
	
	@Test
	public void testSetExcludeAmbigousCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.EXCLUDE_AMBIGOUS_CHARACTERS_KEY, true);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertTrue(options.shouldExcludeAmbigousCharacters());
	}
	
	@Test
	public void testSetMaxRunningTimeMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MAX_RUNNING_TIME_KEY, 15_000);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(15_000, options.getMaxRunningTime());
	}
	
	@Test
	public void testSetMaxResultsCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.MAX_RESULTS_KEY, 3);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(3, options.getMaxResultsCount());
	}
	
	@Test
	public void testSetThreadsCountMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.THREADS_COUNT_KEY, 1);
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals(1, options.getThreadsCount());
	}
	
	@Test
	public void testSetSymbolsMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.SYMBOLS_KEY, "test");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("test", options.getSymbols());
	}
	
	@Test
	public void testSetNumbersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.NUMBERS_KEY, "1234");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("1234", options.getNumbers());
	}
	
	@Test
	public void testSetLowercaseCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.LOWERCASE_CHARACTERS_KEY, "test");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("test", options.getLowercaseCharacters());
	}
	
	@Test
	public void testSetUppercaseCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.UPPERCASE_CHARACTERS_KEY, "TEST");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("TEST", options.getUppercaseCharacters());
	}

	@Test
	public void testSetSimilarCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.SIMILAR_CHARACTERS_KEY, "test");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("test", options.getSimilarCharacters());
	}
	
	@Test
	public void testSetAmbigousCharactersMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(StrongPasswordMapOptions.AMBIGOUS_CHARACTERS_KEY, "test");
		StrongPasswordMapOptions options = new StrongPasswordMapOptions(map);
		Assert.assertEquals("test", options.getAmbigousCharacters());
	}
}
