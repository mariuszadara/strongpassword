package org.mariuszadara.strongpassword.internal;

import org.mariuszadara.strongpassword.api.StrongPasswordOptions;
import org.mariuszadara.strongpassword.api.StrongPasswordValidator;

public class StrongPasswordValidatorImpl implements StrongPasswordValidator {

	private String allSymbols;
	private String allNumbers;
	private String allLowercaseCharacters;
	private String allUppercaseCharacters;

	private int minSymbols;
	private int minNumbers;
	private int minLowercaseCharacters;
	private int minUppercaseCharacters;
	private int maxGroupLength;
	
	private boolean includeSymbols;
	private boolean includeNumbers;
	private boolean includeLowercaseCharacters;
	private boolean includeUppercaseCharacters;
	private boolean includeCharacters;
	
	@Override
	public boolean isValid(StrongPasswordOptions options, String candidate) {
		
		init(options);
		
		// @formatter:off
		return 
			(includeSymbols ? (countSymbols(candidate) >= minSymbols) : true) &&
			(includeNumbers ? (countNumbers(candidate) >= minNumbers) : true) &&
			(includeLowercaseCharacters ? (countLowercaseCharacters(candidate) >= minLowercaseCharacters) : true) &&
			(includeUppercaseCharacters ? (countUppercaseCharacters(candidate) >= minUppercaseCharacters) : true) && 
			
			(includeCharacters && (includeSymbols || includeNumbers) ? !isOnlyLetters(candidate) : true) &&
			(includeNumbers && (includeSymbols || includeCharacters) ? !isOnlyNumbers(candidate) : true) &&
			(includeSymbols && (includeNumbers || includeCharacters) ? !isOnlySymbols(candidate) : true) &&
			
			(includeCharacters && (includeSymbols || includeNumbers) ? (countRepeatCharacters(candidate) == 0) : true) &&
			
			(includeUppercaseCharacters && (includeSymbols || includeNumbers) ? (countConsecutiveUppercaseCharacters(candidate) == 0) : true) &&
			(includeLowercaseCharacters && (includeSymbols || includeNumbers) ? (countConsecutiveLowercaseCharacters(candidate) == 0) : true) &&
			(includeNumbers && (includeSymbols || includeCharacters) ? (countConsecutiveNumbers(candidate) == 0) : true) &&
			(includeSymbols && (includeNumbers || includeCharacters) ? (countConsecutiveSymbols(candidate) == 0) : true) &&
	
			(includeCharacters && (includeSymbols || includeNumbers) ? (countGroupedLetters(candidate, maxGroupLength) == 0) : true) &&
			(includeNumbers && (includeSymbols || includeCharacters) ? (countGroupedNumbers(candidate, maxGroupLength) == 0) : true) &&
			(includeSymbols && (includeNumbers || includeCharacters) ? (countGroupedSymbols(candidate, maxGroupLength) == 0) : true);

		 // @formatter:on
	}
	
	private void init(StrongPasswordOptions options) {
		
		allSymbols = options.getSymbols();
		allNumbers = options.getNumbers();
		allLowercaseCharacters = options.getLowercaseCharacters();
		allUppercaseCharacters = options.getUppercaseCharacters();
		
		minSymbols = options.getMinSymbolsCount();
		minNumbers = options.getMinNumbersCount();
		minLowercaseCharacters = options.getMinLowercaseCharactersCount();
		minUppercaseCharacters = options.getMinUppercaseCharactersCount();

		includeSymbols = options.shouldUseSymbols();
		includeNumbers = options.shouldUseNumbers();
		includeLowercaseCharacters = options.shouldUseLowercaseCharacters();
		includeUppercaseCharacters = options.shouldUseUppercaseCharacters();
		includeCharacters = includeLowercaseCharacters || includeUppercaseCharacters;
		
		// @formatter:off
		int groups = 
				(includeSymbols ? 1 : 0) + 
				(includeNumbers ? 1 : 0) + 
				(includeLowercaseCharacters ? 1 : 0) + 
				(includeUppercaseCharacters ? 1 : 0);
		// @formatter:on
		
		maxGroupLength = groups == 0 ? 3 : options.getPasswordLength() / groups;
	}

	private long countSymbols(String candidate) {
		return count(candidate, allSymbols);
	}

	private long countNumbers(String candidate) {
		return count(candidate, allNumbers);
	}

	private long countLowercaseCharacters(String candidate) {
		return count(candidate, allLowercaseCharacters);
	}

	private long countUppercaseCharacters(String candidate) {
		return count(candidate, allUppercaseCharacters);
	}

	private long count(String candidate, String list) {
		return candidate.chars().filter(ch -> list.indexOf(ch) != -1).count();
	}

	private boolean isOnlyLetters(String entry) {
		return isOnly(entry, allLowercaseCharacters) && isOnly(entry, allUppercaseCharacters);
	}

	private boolean isOnlyNumbers(String entry) {
		return isOnly(entry, allNumbers);
	}

	private boolean isOnlySymbols(String entry) {
		return isOnly(entry, allSymbols);
	}

	private boolean isOnly(String entry, String list) {
		return entry.chars().allMatch(ch -> list.indexOf(ch) != -1);
	}

	private int countRepeatCharacters(String entry) {
		return entry.length() - (int) entry.chars().distinct().count();
	}

	private int countConsecutiveUppercaseCharacters(String entry) {

		var count = 0;

		for (var i = 0; i < entry.length() - 1; i++) {

			if (!isUppercaseCharacter(entry.charAt(i))) {
				continue;
			}

			if (isUppercaseCharacter(entry.charAt(i + 1))) {
				count++;
			}
		}

		return count;
	}

	private boolean isUppercaseCharacter(char entry) {
		return Character.isUpperCase(entry);
	}

	private int countConsecutiveLowercaseCharacters(String entry) {

		var count = 0;

		for (var i = 0; i < entry.length() - 1; i++) {

			if (!isLowercaseCharacter(entry.charAt(i))) {
				continue;
			}

			if (isLowercaseCharacter(entry.charAt(i + 1))) {
				count++;
			}
		}

		return count;
	}

	private boolean isLowercaseCharacter(char entry) {
		return Character.isLowerCase(entry);
	}

	private int countConsecutiveNumbers(String entry) {

		var count = 0;

		for (var i = 0; i < entry.length() - 1; i++) {
			if (isNumber(entry.charAt(i)) && isNumber(entry.charAt(i + 1))) {
				count++;
			}
		}

		return count;
	}

	private boolean isNumber(char entry) {
		return allNumbers.indexOf(entry) != -1;
	}

	private int countConsecutiveSymbols(String entry) {

		var count = 0;

		for (var i = 0; i < entry.length() - 1; i++) {

			if (isSymbol(entry.charAt(i)) && isSymbol(entry.charAt(i + 1))) {
				count++;
			}
		}

		return count;
	}

	private boolean isSymbol(char entry) {
		return allSymbols.indexOf(entry) != -1;
	}

	private int countGroupedLetters(String entry, int groupLength) {
		return countGrouped(entry, groupLength, allLowercaseCharacters) + countGrouped(entry, groupLength, allUppercaseCharacters);
	}

	private int countGroupedNumbers(String entry, int groupLength) {
		return countGrouped(entry, groupLength, allNumbers);
	}

	private int countGroupedSymbols(String entry, int groupLength) {
		return countGrouped(entry, groupLength, allSymbols);
	}

	private int countGrouped(String entry, int groupLength, String list) {

		var groupsCount = 0;
		var currentGroupLength = 0;
		
		for (var i=0; i < entry.length(); i++) {
			
			if (list.indexOf(entry.charAt(i)) != -1)  {
				
				if (currentGroupLength == groupLength) {
					groupsCount ++;
					currentGroupLength = 0;
				}
				
				currentGroupLength ++;
			}
			else {
				currentGroupLength = 0;
			}
		}
		
		if (currentGroupLength == groupLength) {
			groupsCount ++;
		}			
		
		return groupsCount;
	}
}
