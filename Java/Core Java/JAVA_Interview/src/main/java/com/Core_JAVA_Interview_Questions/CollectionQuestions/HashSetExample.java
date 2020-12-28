package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// Creating HashSet object

		HashSet<String> set = new HashSet<String>();

		// Adding elements to HashSet

		set.add("JAVA");

		set.add("JSP");

		set.add("STRUTS");

		set.add("HIBERNATE");

		set.add("JSP");

		set.add("JAVA");

		// Printing the elements of HashSet

		System.out.println(set); // Output : [STRUTS, HIBERNATE, JSP, JAVA]

		// You can notice that duplicate elements are not added to HashSet

		// Adding 3 null elements to hashSet

		set.add(null);

		set.add(null);

		set.add(null);

		// Printing the elements of HashSet

		System.out.println(set); // Output : [null, ONE, TWO, THREE, FOUR]

		// You can notice that HashSet contains only one null element
		
		//getting synchronized set
		 
        Set<String> syncSet = Collections.synchronizedSet(set);
	}

}
