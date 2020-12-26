package com.Core_JAVA_Interview_Questions.StringClassQusetions.StringPrograms;

import java.util.HashMap;

/*
 * Java Program To Count Occurrences Of Each Character In String :
 */
public class EachCharCountInString {

	private static void characterCount(String inputString) {

		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] strArray = inputString.toCharArray();

		for (char ch : strArray) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}

		System.out.println("Input String : " + inputString);
		System.out.println("Character Counts : \n " + charCountMap);

	}

	public static void main(String[] args) {

		characterCount("Java J2EE Java JSP J2EE".trim().replaceAll(" ", "").toLowerCase());

		characterCount("All Is Well".trim().toLowerCase());

	}

}
