package org.mariuszadara.strongpassword.internal;

import org.mariuszadara.strongpassword.api.StrongPasswordEstimator;
import org.mariuszadara.strongpassword.api.StrongPasswordException;
import org.mariuszadara.strongpassword.api.StrongPasswordOptions;

public class StrongPasswordEstimatorImpl implements StrongPasswordEstimator {

	@Override
	public double estimateDecodeTime(StrongPasswordOptions options, String password) {
		
		options.validate();

		if (password == null || password.trim().isEmpty()) {
			throw new StrongPasswordException(StrongPasswordException.PASSWORD_TO_VALIDATE_IS_INVALID, "The provided password is invalid");
		}
		
		var allSymbols = options.getSymbols();
		var allNumbers = options.getNumbers();
		var allLowercaseCharacters = options.getLowercaseCharacters();
		var allUppercaseCharacters = options.getUppercaseCharacters();

		var symbolsCount = count(password, allSymbols);
		var numbersCount = count(password, allNumbers);
		var lowercaseCount = count(password, allLowercaseCharacters);
		var uppercaseCount = count(password, allUppercaseCharacters);
		
		var symbolsPower = symbolsCount > 0 ? symbolsCount + 20 : 0;
		var numbersPower = numbersCount > 0 ? numbersCount + 10 : 0;
		var lowercasePower = lowercaseCount > 0 ? lowercaseCount + 26 : 0;
		var uppercasePower = uppercaseCount > 0 ? uppercaseCount + 26 : 0;
		
		var power = symbolsPower + numbersPower + lowercasePower + uppercasePower;		
		
		return Math.pow(password.length(), power) / 2300200000L;
	}
	
	
	private long count(String candidate, String list) {
		return candidate.chars().filter(x -> list.indexOf(x) != -1).count();
	}
}
