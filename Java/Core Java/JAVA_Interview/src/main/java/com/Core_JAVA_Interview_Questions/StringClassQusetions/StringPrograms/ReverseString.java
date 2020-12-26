package com.Core_JAVA_Interview_Questions.StringClassQusetions.StringPrograms;

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

	}

}
