package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class ExceptionPropogation {

	/*
	 * In the following example also, try-catch blocks are nested. main() method
	 * calls nestedTry() method. nestedTry() method has one try-catch block. First
	 * statement in try block throws NumberFormatException which is not handled by
	 * it’s catch block. So, It propagates to try-catch block of main method which
	 * handles this exeption.
	 */
	public static void main(String[] args) {
		try {
			nestedTry();
		} catch (Exception ex) {
			System.out.println("NumberFormatException will be caught here in main method");
		}
	}

	static void nestedTry() {
		try {
			int i = Integer.parseInt("abc"); // This statement throws NumberFormatException
		} catch (NullPointerException ex) {
			System.out.println("NumberFormatException will not be caught here");
		}
	}

}
