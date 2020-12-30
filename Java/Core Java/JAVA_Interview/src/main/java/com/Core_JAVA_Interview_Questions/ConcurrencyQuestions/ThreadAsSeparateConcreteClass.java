package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadAsSeparateConcreteClass {

	/*
	 * Different Ways Of Defining Threads In Java:
	 * 1) Thread As A Separate Concrete Class
	 */
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();
	}

}

class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Keep some task here!!!");
	}
}