package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {

		 LinkedList<Integer> queue = new LinkedList<Integer>();
		 
	        //adding the elements into the queue
	 
		 queue.offer(10);
		 queue.offer(20);
		 queue.offer(30);
		 queue.offerLast(40);
		 
		 System.out.println(queue);      //Output : [10, 20, 30, 40]
		 
		//Removing the elements from the queue
		 System.out.println(queue.poll());
		 System.out.println(queue);      //Output : [10, 20, 30]
		 
		
	}

}
