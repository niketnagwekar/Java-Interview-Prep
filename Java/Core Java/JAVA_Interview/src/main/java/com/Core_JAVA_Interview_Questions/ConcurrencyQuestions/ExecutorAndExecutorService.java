package com.Core_JAVA_Interview_Questions.ConcurrencyQuestions;

public class ExecutorAndExecutorService {

	public static void main(String[] args) {

	}

}

class MyRunnable implements Runnable {
	 
    int taskNumber;
 
    MyRunnable(int taskNumber) {
           this.taskNumber = taskNumber;
    }
 
    @Override
    public void run() {
 
           System.out.println(Thread.currentThread().getName()
                        + " executing task no " + taskNumber);
 
           try {
                  Thread.sleep(1000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
 
    }
}