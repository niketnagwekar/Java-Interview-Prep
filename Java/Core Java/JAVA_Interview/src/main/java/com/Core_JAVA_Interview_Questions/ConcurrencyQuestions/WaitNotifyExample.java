package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class WaitNotifyExample {

	public static void main(String[] args) {

		 final SharedWaitNotifyExample s = new SharedWaitNotifyExample();
		 
		 Thread t1 = new Thread() {
			 public void run() {
				 s.methodOne();
			 }
		 };
		 
		 Thread t2 = new Thread() {
			 public void run() {
				 s.methodTwo();
			 }
		 };
		 
		 t1.start();
		 t2.start();
		 
	}

}


class SharedWaitNotifyExample{
	synchronized void methodOne() {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : is releasing the lock and going to wait");
		
		try {
			wait();   //releases the lock of this object and waits
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread.getName() + " : got the object lock back and can continue with it's execution");
	}
	
	synchronized void methodTwo() {
		Thread thread = Thread.currentThread();
		
		try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		notify();  //wakes up one thread randomly which is waiting for lock of this object
		System.out.println("A thread which is waiting for lock of this object is notified by "+thread.getName());
	}
}