package com.Core_JAVA_Interview_Questions.StringClassQuestions.StringPrograms;

import java.util.HashMap;
import java.util.Set;

/*
 * How To Find Duplicate Characters In A String In Java?
 */
public class DuplicateCharactersInString {

	static void duplicateCharCount(String inputString) {

		HashMap<Character, Integer> charCountMap = EachCharCountInString.characterCount(inputString);

		Set<Character> charsInString = charCountMap.keySet();

		System.out.println("Duplicate Characters In " + inputString);

		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}

	}

	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");

		duplicateCharCount("Fresh Fish");

	}

}
