package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements at the end of the list

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("JDBC");

		// Printing the elements of list

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		String s = "JSP";

		// Checking whether list contains "JSP"

		boolean contains = list.contains(s);

		if (contains) {
			// If list contains "JSP", printing it's index

			System.out.println(list.indexOf(s)); // Output : 2
		}

		s = "STRUTS";

		// Checking whether list contains "STRUTS"

		contains = list.contains("STRUTS");

		if (contains) {
			// If list contains "STRUTS", printing it's index

			System.out.println(list.indexOf(s));
		}

		// to traverse the elements of a LinkedList in reverse direction?

		// Printing the elements of list

		System.out.println(list); // Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

		// Getting the Iterator object using descendingIterator() method

		Iterator<String> it = list.descendingIterator();

		// printing the elements of list in reverse order

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.push("New Item PUSHED");
		System.out.println(list); // Output: [New Item PUSHED, JAVA, J2EE, JSP, SERVLETS, JDBC]
		
		// peek  --> Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(list.peek());
		
		System.out.println(list); // Output: [New Item PUSHED, JAVA, J2EE, JSP, SERVLETS, JDBC]
		
		//Creating an ArrayList
		 
        ArrayList<String> arrayList = new ArrayList<String>();
 
        arrayList.add("SIX");
 
        arrayList.add("SEVEN");
 
        arrayList.add("EIGHT");
 
        arrayList.add("NINE");
 
        //Printing the elements of ArrayList
 
        System.out.println(arrayList); 
      //Appending arrayList at the end of linkedList
        
        list.addAll(arrayList);
 
        //Printing the elements of linkedList
        System.out.println(list); // Output: [New Item PUSHED, JAVA, J2EE, JSP, SERVLETS, JDBC, SIX, SEVEN, EIGHT, NINE]

	}
}
