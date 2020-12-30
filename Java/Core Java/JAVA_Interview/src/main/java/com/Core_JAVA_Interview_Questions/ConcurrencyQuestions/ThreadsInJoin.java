package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadsInJoin {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main thread started : Task is to print numbers from 0 to 300");
		
		final Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                //Thread t1 started : Task is to print numbers from 0 to 1000"
 
                for(int i = 0; i <= 100; i++)
                {
                    System.out.println(i);
                }
 
                System.out.println("Numbers from 0 to 100 are printed");
            }
        };
        
        final Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                //Thread t2 started : Task is to print numbers from 1001 to 2000
 
                try
                {
                    t1.join(5000, 500000);   //waits at most 5.5 seconds for thread t1 to finish it's task
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
 
                for(int i = 101; i <= 200; i++)
                {
                    System.out.println(i);
                }
 
                System.out.println("Numbers from 101 to 200 are printed");
            }
        };
        
        Thread t3 = new Thread()
        {
            @Override
            public void run()
            {
                //Thread t3 started : Task is to print numbers from 2001 to 3000
 
                try
                {
                    t2.join(5000);   //waits at most 5 seconds for thread t2 to finish it's task
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
 
                for(int i = 201; i <= 300; i++)
                {
                    System.out.println(i);
                }
 
                System.out.println("Numbers from 201 to 300 are printed");
            }
        };
        
        t3.start();
        
        t2.start();
        
        t1.start();
        
        t3.join();     //Waits for t3 thread to finish it's task
        
      //No need enclose this join statement in try-catch blocks as we have already specified the exception with throws clause.
        
        System.out.println("Task is finished");
	}

}
