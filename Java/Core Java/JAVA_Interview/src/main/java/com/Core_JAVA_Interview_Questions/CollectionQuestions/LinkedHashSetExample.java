package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Let’s consider that you want to create a pool of customers placed in the order they have arrived. Assume that it is also mandatory that duplicate customers must not be allowed. For such requirements, LinkedHashSet is the best suitable.
 */

class Customer {
	String name;

	int id;

	public Customer(String name, int id) {
		this.name = name;

		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Customer customer = (Customer) obj;

		return (id == customer.id);
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}
}
/*
 * You might have observed that equals() and hashCode() methods in the above
 * class are overrided so that Customer objects will be compared solely based on
 * id. That means two Customer objects having same id will be considered as
 * duplicates and they will not be allowed in the pool.
 */

public class LinkedHashSetExample {

	public static void main(String[] args) {
		//Creating LinkedHashSet
		 
        LinkedHashSet<Customer> set = new LinkedHashSet<Customer>();
 
        //Adding elements to LinkedHashSet
 
        set.add(new Customer("Jack", 17));
 
        set.add(new Customer("Peter", 105));
 
        set.add(new Customer("Ramesh", 415));    
 
        set.add(new Customer("Julian", 814));
 
        set.add(new Customer("Avinash", 105));      //Duplicate Element
 
        set.add(new Customer("Sapna", 879));
 
        set.add(new Customer("John", 546));
 
        set.add(new Customer("Moni", 254));
 
        set.add(new Customer("Ravi", 105));        //Duplicate Element
 
        //Getting Iterator object
 
        Iterator<Customer> it = set.iterator();
 
        while (it.hasNext())
        {
            Customer customer = (Customer) it.next();
 
            System.out.println(customer);
        }
	}

}
