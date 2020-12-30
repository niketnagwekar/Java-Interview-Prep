package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadAsAnonymousInnerClass {

	/*
	 * Different Ways Of Defining Threads In Java::
	 * 5) Thread As An Anonymous Inner Class
	 */
	public static void main(String[] args) {

		//Thread as an anonymous inner class
		new Thread() {
			
			@Override
			public void run() {
				System.out.println("In anonymous inner class...");
			}
		}.start();
		
		//Thread as an anonymous inner class using Runnable Interface
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In anonymous inner class using Runnable Interface...");
			}
		}).start();
	}

}
