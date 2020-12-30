package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadAsLocalInnerClass {

	/*
	 * Different Ways Of Defining Threads In Java::
	 * 4) Thread As A Local Inner Class
	 */
	public static void main(String[] args) {

		class MyThread1 extends Thread{
			
			@Override
			public void run() {
				System.out.println("In MyThread1...");
			}
		}
		class MyThread2 implements Runnable{
			
			@Override
			public void run() {
				System.out.println("In MyThread2...");
			}
		}
		
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
		
	}

}
