package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class NestedTryCatch {

	/*
	 * If the exception thrown by the inner try block can not be caught by it’s
	 * catch block, then this exception is propagated to outer try blocks. Any one
	 * of the outer catch block should handle this exception otherwise program will
	 * terminate abruptly.
	 */
	public static void main(String[] args) {

		String[] s = { "abc", "123", null, "xyz" }; // String array containing one null object

		for (int i = 0; i < s.length; i++) {
			try // Outer try block
			{
				int a = s[i].length(); // This statement may throw NullPointerException

				try // Inner try block
				{
					a = Integer.parseInt(s[i]); // This statement may throw NumberFormatException
				} catch (NumberFormatException ex) // Inner catch block
				{
					System.out.println("NumberFormatException will be caught here in inner catch block");
				}
			} catch (NullPointerException ex) // Outer catch block
			{
				System.out.println("NullPointerException will be caught here in outer catch block");
			}
		}

	}

}
