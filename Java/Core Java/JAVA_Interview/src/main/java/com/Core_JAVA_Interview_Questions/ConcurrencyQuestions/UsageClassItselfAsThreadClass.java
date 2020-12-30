package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class UsageClassItselfAsThreadClass  extends Thread{

	/*
	 * Different Ways Of Defining Threads In Java::
	 * 6) Usage class itself as a thread class.
	 */
	@Override
	public void run() {
		System.out.println("In Usage class itself as a thread class....");
	}
	public static void main(String[] args) {

		UsageClassItselfAsThreadClass usageClassItselfAsThreadClass = new UsageClassItselfAsThreadClass();
		usageClassItselfAsThreadClass.start();
	}

}

class AnotherUsageClass{
	void myMethod() {
		UsageClassItselfAsThreadClass usageClassItselfAsThreadClass = new UsageClassItselfAsThreadClass();
		usageClassItselfAsThreadClass.start();
	}
}
