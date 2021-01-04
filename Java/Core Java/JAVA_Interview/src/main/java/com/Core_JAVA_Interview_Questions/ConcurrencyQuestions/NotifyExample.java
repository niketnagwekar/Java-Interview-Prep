package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class NotifyExample {

	public static void main(String[] args) {

		final SharedExample s = new SharedExample();

		// Thread t1 will be waiting for lock of object 's'

		Thread t1 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}
		};

		t1.start();

		// Thread t2 will be waiting for lock of object 's'

		Thread t2 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}
		};

		t2.start();

		// Thread t1 will be waiting for lock of object 's'

		Thread t3 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}
		};

		t3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Thread t4 will notify only one thread which is waiting for lock of object 's'
        
        Thread t4 = new Thread() 
        {
            @Override
            public void run()
            {
//                s.notifyOneThread();
            	s.notifyAllThread();
            }
        };
         
        t4.start(); 
	}

}

class SharedExample {

	synchronized void waitMethod() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + " is releasing the lock and going to wait");

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(t.getName() + " has been notified and acquired the lock back");
	}

	synchronized void notifyOneThread() {
		Thread t = Thread.currentThread();

		notify();

		System.out.println(t.getName() + " has notified one thread waiting for this object lock");
	}
	
	synchronized void notifyAllThread() {
		Thread t = Thread.currentThread();

		notifyAll();

		System.out.println(t.getName() + " has notified all threads waiting for this object lock");
	}
}
