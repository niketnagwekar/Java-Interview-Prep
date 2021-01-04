package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadExample2 {

	public static void main(String[] args) {

		
		MyThread2 myThread2 = new MyThread2();
		 
        //Calling run() method directly
         
        myThread2.run();
 
        //Calling start() method. It creates a new thread which executes run() method
 
        myThread2.start();
        
	}

}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("I am executed by "+currentThread().getName());
    }
}
