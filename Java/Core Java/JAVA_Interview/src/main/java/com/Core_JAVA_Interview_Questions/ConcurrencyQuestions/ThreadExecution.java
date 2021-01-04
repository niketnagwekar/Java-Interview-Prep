package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadExecution {

	public static void main(String[] args)    {
        Thread t1 = new Thread()
        {
            public void run()
            {
//                String s = null;
// 
//                System.out.println(s.length());  //This statement will throw NullPointerException
// 
//                System.out.println("This statement will not be executed");
            }
        };
 
        Thread t2 = new Thread()
        {
            public void run()
            {
                for(int i = 0; i <= 1000; i++)
                {
                    System.out.println(i);
                }
            }
        };
 
        t1.start();
 
        t2.start();
        
        Thread t = new Thread()
        {
            public void run()
            {
                System.out.println(Thread.currentThread().getName());    //Output : main
            }
        };
 
        t.run();
    }
}