package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {

		HashSet<TreeSetStudent> set = new HashSet<TreeSetStudent>();

		// Adding elements to HashSet

		set.add(new TreeSetStudent("Avinash", 121, "ECE"));

		set.add(new TreeSetStudent("Bharat", 101, "EEE"));

		set.add(new TreeSetStudent("Malini", 151, "Civil"));

		set.add(new TreeSetStudent("Suresh", 200, "IT"));

		set.add(new TreeSetStudent("Vikram", 550, "CS"));

		set.add(new TreeSetStudent("Bharat", 301, "IT"));

		set.add(new TreeSetStudent("Amit", 301, "IT")); // duplicate element

		set.add(new TreeSetStudent("Bhavya", 872, "ECE"));

		set.add(new TreeSetStudent("Naman", 301, "CS")); // duplicate element

		set.add(new TreeSetStudent("Samson", 565, "Civil"));

		// Iterating through HashSet

		Iterator<TreeSetStudent> it = set.iterator();

		while (it.hasNext()) {
			TreeSetStudent student = (TreeSetStudent) it.next();

			System.out.println(student);
		}
	}

}

class Student {
	String name;

	int rollNo;

	String department;

	public Student(String name, int rollNo, String department) {
		this.name = name;

		this.rollNo = rollNo;

		this.department = department;
	}

	@Override
	public int hashCode() {
		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		TreeSetStudent student = (TreeSetStudent) obj;

		return (rollNo == student.rollNo);
	}

	@Override
	public String toString() {
		return rollNo + ", " + name + ", " + department;
	}
}
