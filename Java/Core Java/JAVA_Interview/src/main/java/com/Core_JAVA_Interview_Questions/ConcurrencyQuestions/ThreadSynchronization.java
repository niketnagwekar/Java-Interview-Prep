package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;


class Shared
{
    int i;
 
    synchronized void SharedMethod()
    {
        Thread t = Thread.currentThread();
 
        for(i = 0; i <= 1000; i++)
        {
            System.out.println(t.getName()+" : "+i);
        }
    }
}

public class ThreadSynchronization {

	public static void main(String[] args) {

		final Shared s1 = new Shared();
		 
        Thread t1 = new Thread("Thread - 1")
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
        
        Thread t2 = new Thread("Thread - 2")
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
        
        
        t1.start();
        
        t2.start();
        
	}

}
