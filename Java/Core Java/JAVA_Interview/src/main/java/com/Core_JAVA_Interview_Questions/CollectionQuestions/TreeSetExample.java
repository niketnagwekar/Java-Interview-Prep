package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// Creating a TreeSet

		TreeSet<Integer> set = new TreeSet<Integer>();

		// Adding elements to TreeSet

		set.add(20);

		set.add(10);

		set.add(40);

		set.add(80);

		set.add(90);

		// Printing elements of TreeSet
		System.out.println(set); // Output : [10, 20, 30, 40, 80]

//		// Notice that elements are placed in the sorted order.
		
//		TreeSet<Object> set = new TreeSet<Object>();
//
//		//Adding elements to TreeSet
//		 
//        set.add("kkk");      //inserting String type element
// 
//        set.add(10);        //inserting Integer type element
// 
//        set.add(new Object());      //inserting Object type element
// 
//        set.add(20.65);     //inserting Double type element
 
        //The elements inserted are not mutually comparable. So, it will throw ClassCastException.
//        Exception in thread "main" []
//        		java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//        			at java.lang.Integer.compareTo(Unknown Source)
//        			at java.util.TreeMap.put(Unknown Source)
//        			at java.util.TreeSet.add(Unknown Source)
//        			at com.Core_JAVA_Interview_Questions.CollectionQuestions.TreeSetExample.main
        
	}

}
