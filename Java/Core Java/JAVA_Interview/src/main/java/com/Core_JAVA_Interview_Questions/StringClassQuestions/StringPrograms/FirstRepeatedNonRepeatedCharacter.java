package com.Core_JAVA_Interview_Questions.StringClassQuestions.StringPrograms;

import java.util.HashMap;

/*
 * How To Find First Repeated And Non-Repeated Character In A String?
 */
public class FirstRepeatedNonRepeatedCharacter {

	static void firstRepeatedNonRepeatedChar(String inputString) {
		HashMap<Character, Integer> charCountMap = EachCharCountInString.characterCount(inputString);

		// Converting inputString to char array
		char[] strArray = inputString.toCharArray();
		
		// Checking for first non-repeated character
		for (char ch : strArray) {
			if(charCountMap.get(ch).equals(1)) {
				System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+ch+"'");
				break;
			}
		}
		
		// Checking for first repeated character
		for (char ch : strArray) {
			if(charCountMap.get(ch) > 1) {
				System.out.println("First Repeated Character In '"+inputString+"' is '"+ch+"'");
				break;
			}
		}

	}

	public static void main(String[] args) {
		firstRepeatedNonRepeatedChar("JavaConceptOfTheDay".toLowerCase().trim());
	}

}
