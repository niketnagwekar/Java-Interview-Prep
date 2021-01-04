package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadGroupInJava {

	public static void main(String[] args) {

		// Creating Parent Thread Group

		ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group");

		// Adding threads to ThreadGroup while creating threads itself

		Thread t1 = new Thread(parentGroup, "Thread 1");

		Thread t2 = new Thread(parentGroup, "Thread 2");

		// Creating child thread group

		ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Thread Group");

		// Adding a thread to child thread group

		Thread t3 = new Thread(childGroup, "Thread 3") {
			public void run() {
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t3.start();

		Thread t4 = new Thread(childGroup, "Thread 4") {
			public void run() {
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		t4.start();

		// Printing parent of Child Thread Group

		System.out.println(childGroup.getParent()); // Output : java.lang.ThreadGroup[name=Parent Thread Group
													// ,maxpri=10]

		// Setting the daemon property of thread group

		childGroup.setDaemon(true);

		// Checking the daemon property of thread group

		System.out.println(childGroup.isDaemon()); // Output : true

		// Setting the maximum priority of thread group

		childGroup.setMaxPriority(8);

		// getting the maximum priority of thread group

		System.out.println(childGroup.getMaxPriority()); // Output : 8

		// Checking Active thread count

		System.out.println(childGroup.activeCount()); // Output : 3

		// Checking Active thread group count

		System.out.println(parentGroup.activeGroupCount());

		// Interrupting whole group

		parentGroup.interrupt();

		// Destroying the whole group

		parentGroup.destroy();
	}

}
