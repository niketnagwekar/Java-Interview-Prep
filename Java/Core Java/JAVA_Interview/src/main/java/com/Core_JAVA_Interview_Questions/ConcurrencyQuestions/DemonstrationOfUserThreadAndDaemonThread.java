package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class DemonstrationOfUserThreadAndDaemonThread {

	/*
	 * In the below program, The task of daemon thread will not be completed.
	 * Program terminates as soon as user thread finishes it’s task. It will not
	 * wait for daemon thread to finish it’s task.
	 */
	public static void main(String[] args) {

//		DaemonThread daemon = new DaemonThread("Deeeamon Thread"); // Creating the DaemonThread
//
//		daemon.start(); // Starting the daemon thread

		UserThread1 userThread1 = new UserThread1("User Thead in Action!!"); // Creating the UserThread
		System.out.println("UserThread getName " + userThread1.getName());
		userThread1.start(); // Starting the user thread

		userThread1.setName("UserThread Name Changed!!!");

		// User Thread Changing Priority
		userThread1.setPriority(7);

		// getting thread priority of user Thread
		System.out.println("UserThread priority : " + userThread1.getPriority());

		// User Thread Changing Priority using constants
		userThread1.setPriority(Thread.MAX_PRIORITY);

		// getting thread priority of user Thread
		System.out.println("UserThread priority MAX_PRIORITY: " + userThread1.getPriority());

		// User Thread Changing Priority using constants
		userThread1.setPriority(Thread.MIN_PRIORITY);

		// getting thread priority of user Thread
		System.out.println("UserThread priority MIN_PRIORITY : " + userThread1.getPriority());

		// User Thread Changing Priority using constants
		userThread1.setPriority(Thread.NORM_PRIORITY);

		// getting thread priority of user Thread
		System.out.println("UserThread priority NORM PRIORITY: " + userThread1.getPriority());

		System.out.println("UserThread getName " + userThread1.getName());

		Thread t = Thread.currentThread();

		System.out.println("Current Thread Name : " + t.getName()); // Output : main

		// Changing the name of the main thread.
		t.setName("main thread name changed ");

		System.out.println(" New main thread name : " + t.getName());

		// Getting thread Id of main thread
		long ID = t.getId();
		System.out.println("Main Thread ID: " + ID);

	}

}

class UserThread1 extends Thread {
	public UserThread1(String string) {
		super(string);
	}

	@Override
	public void run() {
		System.out.println("This is a user thread1.....");
	}
}

class DaemonThread extends Thread {
	public DaemonThread(String string) {
		super(string);
		setDaemon(true);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("This is daemon thread....." + i);
		}
	}
}
