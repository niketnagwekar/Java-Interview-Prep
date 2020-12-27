package com.Core_JAVA_Interview_Questions.ExceptionHandlingQusetions;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Below example throws  NumberFormatException ======>.");

		try {
			Integer I = new Integer("abc"); // This statement throws NumberFormatException
		} catch (Exception e) {
			System.out.println(" NumberFormatException  caught");
		}

		System.out.println("============================================================");

		System.out.println("Below example throws  ArithmaticException ======>.");

		try {
			int i = 1000 / 0; // This statement throws ArithmaticException : / by zero
		} catch (Exception e) {
			System.out.println(" ArithmaticException : / by zero  caught");
		}

		System.out.println("============================================================");

		System.out.println("Below example throws  ArrayIndexOutOfBoundsException ======>.");

		try {
			String s= args[1];
		} catch (Exception e) {
			System.out.println(" ArrayIndexOutOfBoundsException  caught");
		}

		System.out.println("============================================================");
		
		System.out.println("Below example throws  ClassCastException ======>.");
		Object o = new Object();
		
		try {
			ExceptionHandling e = (ExceptionHandling) o; 
		} catch (Exception e) {
			System.out.println(" ClassCastException  caught");
		}

		System.out.println("============================================================");
		
		System.out.println("Below example throws  NullPointerException  ======>.");
		String s = null;
		
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(" NullPointerException   caught");
		}

		System.out.println("============================================================");

	}

}
