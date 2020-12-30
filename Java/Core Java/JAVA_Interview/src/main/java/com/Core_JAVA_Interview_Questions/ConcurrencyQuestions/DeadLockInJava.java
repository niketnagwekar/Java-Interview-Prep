package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockInJava {

	public static void main(String[] args) {

		final SharedClass s1 = new SharedClass();

		final SharedClass s2 = new SharedClass();

		Thread t1 = new Thread() {
			public void run() {
				s1.methodOne(s2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				s2.methodTwo(s1);
			}
		};

		t1.start();

		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ThreadMXBean bean = ManagementFactory.getThreadMXBean();

		long[] ids = bean.findMonitorDeadlockedThreads();

		if (ids != null) {
			ThreadInfo[] threadInfos = bean.getThreadInfo(ids);

			for (ThreadInfo threadInfo : threadInfos) {
				System.out.println("Prints the ID of deadlocked thread : " + threadInfo.getThreadId());

				System.out.println("Prints the name of deadlocked thread : " + threadInfo.getThreadName());
			}
		} else {
			System.out.println("No Deadlocked Threads");
		}
	}

}

class SharedClass {
	synchronized void methodOne(SharedClass s) {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + "is executing methodOne...");

		System.out.println(t.getName() + "is calling methodTwo...");

		s.methodTwo(this);

		System.out.println(t.getName() + "is finished executing methodOne...");
	}

	synchronized void methodTwo(SharedClass s) {
		Thread t = Thread.currentThread();

		System.out.println(t.getName() + "is executing methodTwo...");

		System.out.println(t.getName() + "is calling methodOne...");

		s.methodOne(this);

		System.out.println(t.getName() + "is finished executing methodTwo...");
	}

}