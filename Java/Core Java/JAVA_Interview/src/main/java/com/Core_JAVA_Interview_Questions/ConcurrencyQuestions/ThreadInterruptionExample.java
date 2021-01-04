package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadInterruptionExample {

	public static void main(String[] args) {

		Thread t = new Thread()
        {
            public void run()
            {
            	System.out.println(isInterrupted());         //Output : true
            	
//            	 for(int i = 0; i <= 1000; i++)
//                 {
//                     System.out.println(i);
//                 }
            	 
                try
                {
                    Thread.sleep(10000);        //Thread is sleeping for 10 seconds
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread is interrupted");
                }
                System.out.println(isInterrupted());         //Output : false
            }
        };
 
        t.start();
 
        t.interrupt();      //main thread is interrupting thread t
        
        final Thread t1 = new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(200000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
 
        System.out.println(t1.getState());  
        
        Thread t2 = new Thread()
        {
            public void run()
            {
//                try
//                {
//                    t1.join();
//                }
//                catch (InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
            }
        };
        
        System.out.println(t2.getState());   
        t2.start();
        
        t1.start();
        System.out.println(t2.getState());  
        System.out.println(t1.getState());  
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        //Checking the state of t2 after it calls join() on t1
 
        System.out.println(t2.getState());     //Output : WAITING
        
	}

}
