package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.ArrayDeque;

public class ArrayDequeExampleAsQueue {

	public static void main(String[] args) {

		// Creating an array deque

		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

		// Adding elements at the tail of arrayDeque

		arrayDeque.offer(1);

		arrayDeque.offer(2);

		arrayDeque.offer(3);

		arrayDeque.offer(4);

		arrayDeque.offer(5);
		arrayDeque.offer(6);
		arrayDeque.offer(7);
		arrayDeque.offer(8);
		arrayDeque.offer(9);
		arrayDeque.offer(10);
		arrayDeque.offer(11);
		arrayDeque.offer(12);
		arrayDeque.offer(13);
		arrayDeque.offer(14);
		arrayDeque.offer(15);
		arrayDeque.offer(16);

		arrayDeque.offer(17);
		arrayDeque.offer(18);
		arrayDeque.offer(19);

		// Printing the elements of arrayDeque

		System.out.println(arrayDeque); // Output : [1, 2, 3..., 18, 19]

		System.out.println(arrayDeque.size());

		// Removing the elements from the head of arrayDeque

		System.out.println(arrayDeque.poll()); // Output : 1

		System.out.println(arrayDeque.poll()); // Output : 2

		/*
		 * Double capacity if small; else grow by 50%
		 *  int jump = (oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1);
		 * It seems that the"doubling" behavior is approximate:
		 *  thanks to the "+2" after the first resize the capacity is
		 * 16+16+2 = 34. After the second resize it's 34+34+2 = 70. After that the array
		 * increases by 50% in every resize.
		 */
	}

}
