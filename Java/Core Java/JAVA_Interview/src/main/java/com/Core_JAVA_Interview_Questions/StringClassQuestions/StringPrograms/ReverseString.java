package com.Core_JAVA_Interview_Questions.StringClassQuestions.StringPrograms;

/*
 * Java Program To Reverse A String?
 */
public class ReverseString {

	// 3) Using recursive method.
	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	// reverse a string preserving spaces
	static void reverseString(String inputString) {
		// Converting inputString to char array 'inputStringArray'
		char[] inputStringArray = inputString.toCharArray();

		// Defining a new char array 'resultArray' with same size as inputStringArray
		char[] resultArray = new char[inputStringArray.length];

		// First for loop :
		// For every space in the 'inputStringArray',
		// we insert spaces in the 'resultArray' at the corresponding positions
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}

		// Initializing 'j' with length of resultArray
		int j = resultArray.length - 1;

		// Second for loop :
		// we copy every non-space character of inputStringArray
		// from first to last at 'j' position of resultArray
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] != ' ') {
				// If resultArray already has space at index j then decrementing 'j'
				if (resultArray[j] == ' ') {
					j--;
				}

				resultArray[j] = inputStringArray[i];

				j--;
			}
		}
		System.out.println(inputString + " ---> " + String.valueOf(resultArray));
	}

	public static void main(String[] args) {

		// 1) Using StringBuffer class:
		StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse()); // Output : avaJyM

		// 2) Using iterative method:
		String str = "MyJava";
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]); // Output : avaJyM
		}
		System.out.println();
		System.out.println(recursiveMethod(str));

		// using reverse a string preserving spaces
		reverseString("I Am Not String");

	}

}
