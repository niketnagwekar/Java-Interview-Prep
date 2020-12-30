package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadAsNestedClassOrStaticInnerClass {

	/*
	 * Different Ways Of Defining Threads In Java::
	 * 2) Thread As A Nested Class or Static Inner Class
	 */
	
	static class MyThread1 extends Thread{
		
		@Override
		public void run() {
			System.out.println("In MyThread1...");
		}
	}
	
	static class MyThread2 implements Runnable{

		@Override
		public void run() {
			System.out.println("In MyThread2...");
		}
		
	}
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
	}

}
