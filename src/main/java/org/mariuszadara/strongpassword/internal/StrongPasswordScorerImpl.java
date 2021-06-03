package org.mariuszadara.strongpassword.internal;

import org.mariuszadara.strongpassword.api.StrongPasswordOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordScorer;

public class StrongPasswordScorerImpl implements StrongPasswordScorer {

	@Override
	public long computeScore(StrongPasswordOptions options, String data) {

		if (options == null || data == null || data.trim().isEmpty()) {
			return 0;
		}
		
		options.validate();
		
		// this implementation is based on the criteria shown at http://www.passwordmeter.com/

		var lowercaseCharactersCount = count(data, options.getLowercaseCharacters());
		var uppercaseCharactersCount = count(data, options.getUppercaseCharacters());
		var charactersCount = lowercaseCharactersCount + uppercaseCharactersCount;
		var numbersCount = count(data, options.getNumbers());
		var symbolsCount = count(data, options.getSymbols());

		var aMiddleChar = data.charAt(data.length() / 2 - 1);
		var middleFirstCharIsNumber = isInList(aMiddleChar, options.getNumbers());
		var middleFirstCharIsSymbol = isInList(aMiddleChar, options.getSymbols());

		aMiddleChar = data.charAt(data.length() / 2);
		var middleSecondCharIsNumber = isInList(aMiddleChar, options.getNumbers());
		var middleSecondCharIsSymbol = isInList(aMiddleChar, options.getSymbols());

		aMiddleChar = data.charAt(data.length() / 2 + 1);
		var middleThirdCharIsNumber = isInList(aMiddleChar, options.getNumbers());
		var middleThirdCharIsSymbol = isInList(aMiddleChar, options.getSymbols());

		// @formatter:off
		var rawMiddleScore = 			
			((middleFirstCharIsNumber || middleFirstCharIsSymbol) ? 1 : 0) + 
			((middleSecondCharIsNumber || middleSecondCharIsSymbol) ? 1 : 0) + 
			((middleThirdCharIsNumber || middleThirdCharIsSymbol) ? 1 : 0);
		// @formatter:on

		// @formatter:off
		return			
			(charactersCount * 4) +
			((data.length() - uppercaseCharactersCount) * 2) +
			((data.length() - lowercaseCharactersCount) * 2) +
			(numbersCount * 4) + 
			(symbolsCount * 6) + 
			(rawMiddleScore * 2) +			
			
			((lowercaseCharactersCount > 0) ? 1 : 0) +
			((uppercaseCharactersCount > 0) ? 1 : 0) +
			((numbersCount > 0) ? 1 : 0) +
			((symbolsCount > 0) ? 1 : 0) + 
			(rawMiddleScore * 2);
		// @formatter:on
	}

	private boolean isInList(char ch, String chars) {
		return chars.indexOf(ch) != -1;
	}

	private long count(String candidate, String list) {
		return candidate.chars().filter(x -> list.indexOf(x) != -1).count();
	}
}
