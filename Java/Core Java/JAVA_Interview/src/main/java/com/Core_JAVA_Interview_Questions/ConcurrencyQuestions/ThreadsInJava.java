package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadsInJava {

	public static void main(String[] args) {

		UserThread userThread = new UserThread();

		System.out.println("Check if running thread is a Deamon thread or not ? :" + userThread.isDaemon());
		userThread.setDaemon(true);
		
		userThread.start();
		System.out.println("Check if running thread is a Deamon thread or not ? :" + userThread.isDaemon());
		/*
		 * You can’t set a daemon property after starting the thread. If you try to set
		 * the daemon property when the thread is active, It will throw a
		 * IllegalThreadStateException at run time.
		 */
//		userThread.setDaemon(true);   //This statement will throw IllegalThreadStateException 
	}

}

class UserThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This is an user thread....");
		}
	}
}
