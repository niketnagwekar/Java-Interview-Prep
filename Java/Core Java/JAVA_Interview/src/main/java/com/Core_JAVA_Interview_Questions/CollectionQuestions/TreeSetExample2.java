package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * we create one TreeSet by supplying a customized Comparator. 
 * In this example, we will try to create a TreeSet of Student objects ordered in the 
 * descending order of the percentage of marks they have obtained.
 * That means, student with highest marks will be placed at the top.
 */

class TreeSetStudent {
	int id;

	String name;

	int perc_Of_Marks_Obtained;

	public TreeSetStudent(int id, String name, int perc_Of_Marks_Obtained) {
		this.id = id;

		this.name = name;

		this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
	}

	@Override
	public String toString() {
		return id + " : " + name + " : " + perc_Of_Marks_Obtained;
	}
}

class MyTreeSetComparator implements Comparator<TreeSetStudent> {
	@Override
	public int compare(TreeSetStudent s1, TreeSetStudent s2) {
		if (s1.id == s2.id) {
			return 0;
		} else {
			return s2.perc_Of_Marks_Obtained - s1.perc_Of_Marks_Obtained;
		}
	}

}

public class TreeSetExample2 {

	/*
	 * TreeSet doesn’t use hashCode() and equals() methods to compare it’s elements.
	 * It uses compare() (or compareTo()) method to determine the equality of two
	 * elements. Therefore, I have kept the code which compares two Student objects
	 * based on their id in compare method itself. This removes possible duplicate
	 * elements (elements having same id) from the TreeSet.
	 */
	public static void main(String[] args) {

		// Instantiating MyComparator
		MyTreeSetComparator comparator = new MyTreeSetComparator();

		// Creating TreeSet with 'MyComparator' as Comparator.
		TreeSet<TreeSetStudent> set = new TreeSet<TreeSetStudent>(comparator);

		set.add(new TreeSetStudent(121, "Santosh", 85));

		set.add(new TreeSetStudent(231, "Cherry", 71));

		set.add(new TreeSetStudent(417, "David", 82));

		set.add(new TreeSetStudent(562, "Praveen", 91));

		set.add(new TreeSetStudent(231, "Raj", 61)); // Duplicate element

		set.add(new TreeSetStudent(458, "John", 76));

		set.add(new TreeSetStudent(874, "Peter", 83));

		set.add(new TreeSetStudent(231, "Hari", 52)); // Duplicate element

		set.add(new TreeSetStudent(568, "Daniel", 89));

		// Iterating through TreeSet

		Iterator<TreeSetStudent> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
