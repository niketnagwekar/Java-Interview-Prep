package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>(3,5);
		
		vector.add(10);
		 
        vector.add(20);
 
        vector.add(30);
 
        vector.add(40);
 
        //again Printing Current Capacity of Vector
 
        System.out.println(vector.capacity());
		
	}

}
