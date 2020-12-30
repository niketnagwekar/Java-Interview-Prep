package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ThreadAsMemberInnerClassOrNonstaticInnerClass {

	/*
	 * Different Ways Of Defining Threads In Java::
	 * 3) Thread As A Member Inner Class or Non-static Inner Class
	 */
	//Thread class as a member inner class or Non-static Inner Class of the usage class
	class MyThread1 extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Keep Some task here.....In MyThread1");
        }
    }
	//Another thread class as a member inner class or Non-Static Inner Class of the usage class
    class MyThread2 implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("Keep some task here.....In MyThread2");
        }
        
    }
	
	public static void main(String[] args) {
		//Using MyThread1 and it's task
		 
        MyThread1 thread1 = new ThreadAsMemberInnerClassOrNonstaticInnerClass().new MyThread1();
        thread1.start();
 
        //Using MyThread2 and it's task
 
        MyThread2 thread2 = new ThreadAsMemberInnerClassOrNonstaticInnerClass().new MyThread2();
        Thread t = new Thread(thread2);
        t.start();
	}

}
