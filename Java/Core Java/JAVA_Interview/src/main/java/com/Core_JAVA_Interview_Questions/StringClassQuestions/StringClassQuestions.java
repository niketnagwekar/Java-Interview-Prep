package com.Core_JAVA_Interview_Questions.StringClassQuestions;

public class StringClassQuestions {

	// String Class Interview Questions

	public static void main(String[] args) {

		// String is a Class in java.lang package & is of derived type.

		// How many ways you can create string objects
//		String s1 = new String("abc"); // by using new operator , objects created in HEAP
//		String s2 = "abc"; // object created in String pool using string literal

		/*
		 * String pool: String objects are most used data objects in Java. Hence, java
		 * has a special arrangement to store the string objects. String Constant Pool
		 * is one such arrangement. String Constant Pool is the memory space in heap
		 * memory specially allocated to store the string objects created using string
		 * literals. In String Constant Pool, there will be no two string objects having
		 * the same content.
		 * 
		 * Whenever you create a string object using string literal, JVM first checks
		 * the content of the object to be created. If there exist an object in the
		 * string constant pool with the same content, then it returns the reference of
		 * that object. It doesn�t create a new object. If the content is different from
		 * the existing objects then only it creates new object.
		 * 
		 * Where exactly string constant pool is located in the memory?
		 * 
		 * Ans: Inside the heap memory. JVM reserves some part of the heap memory to
		 * store string objects created using string literals.
		 */

		// Difference between String , String Buffer & String Builder
		/*
		 * All the 3 Classes : String, StringBuffer and StringBuilder are final & all
		 * are present in java.lang package
		 * 
		 * 1.] Immutability : As objects of String class are immutable, objects of
		 * StringBuffer and StringBuilder class are mutable.
		 * 
		 * 2.] Object Creation : You have to use �new� operator to create objects to
		 * StringBuffer and StringBuilder classes. You can�t use string literals to
		 * create objects to these classes.
		 * 
		 * 3.] Storage Area : As objects of StringBuffer and StringBuilder are created
		 * using only new operator, they are stored in heap memory. Where as objects of
		 * String class are created using both string literals and new operator, they
		 * are stored in string constant pool as well as heap memory.
		 * 
		 * 4.] Thread Safety : Any immutable object in java is thread safety. Because
		 * they are unchangeable once they are created. Any type of thread can�t change
		 * the content of immutable object. This applies to objects of String class
		 * also. Of the StringBuffer and StringBuilder objects, only StringBuffer
		 * objects are thread safety. All necessary methods in StringBuffer class are
		 * synchronized so that only one thread can enter into it�s object at any point
		 * of time. Where as StringBuilder objects are not thread safe.
		 * 
		 * 5.] Performance : String Builder is faster since it is not thread safe .
		 * StringBuffer & String objects are slower since they are thread safe. Because
		 * of thread safety property of String and StringBuffer classes, they reduces
		 * the performance of multithreaded applications. Because, multiple threads
		 * can�t enter into objects of these classes simultaneously. One thread has to
		 * wait until another thread is finished with them.
		 * 
		 * 6.] String Concatenation : There will be serious performance issues when you
		 * are performing lots of string concatenation using String class. This is
		 * because, each time you perform string concatenation using string class, a new
		 * object will be created with the concatenated string. This slows down an
		 * application. But, if you use either StringBuffer or StringBuilder instead of
		 * String class, your application will perform better.
		 * 
		 * 7.] equals() and hashCode() Methods : In StringBuffer and StringBuilder
		 * classes, equals() and hashCode methods are not overrided. Where as in String
		 * class they are overrided.
		 * 
		 * 8.] toString() Method : toString() method is overrided in all three classes.
		 * You can also convert StringBuffer and StringBuilder objects to String type by
		 * calling toString() method on them.
		 * 
		 * 
		 * toCharArray() method: convert given string to char array
		 * 
		 * Why strings have been made immutable in java?
		 * 
		 * a) Immutable strings increase security. As they can�t be modified once they
		 * are created, so we can use them to store sensitive data like username,
		 * password etc.
		 * 
		 * b) Immutable strings are thread safe. So, we can use them in a multi threaded
		 * code without synchronization.
		 * 
		 * c) String objects are used in class loading. If strings are mutable, it is
		 * possible that wrong class is being loaded as mutable objects are modifiable.
		 * 
		 * What do you think about string constant pool? Why they have provided this
		 * pool as we can store string objects in the heap memory itself?
		 * 
		 * String constant pool increases the reusability of existing string objects.
		 * When you are creating a string object using string literal, JVM first checks
		 * string constant pool. If that object is available, it returns reference of
		 * that object rather creating a new object. This will also speed up your
		 * application as only reference is returned and also saves the memory as no two
		 * objects with same content are created.
		 */
		
		int i = 5000;
		 
        double d = 6000.0006;
 
        String s = "Java";
 
        System.out.println(i+d+s);      //Output : 11000.0006Java
 
        System.out.println(s+i+d);      //Output : Java50006000.0006
 
        System.out.println(i+s+d); 
        
        // Interview Q
        
        String s1 = null;
        
        String s2 = null;
 
        System.out.println(s1+s2);       //Output : nullnull
 
        System.out.println("null"+"null");    //Output : nullnull
 
        System.out.println(s1+"JAVA"+s2);
        
        
        System.out.println("===================================================================");
        
        System.out.println("abc".charAt(0));          //Output : a
        
        System.out.println("abc".equalsIgnoreCase("ABC"));      //Output : true
 
        System.out.println("abc".compareTo("abc"));         //Output : 0
        
        System.out.println("abc".compareTo("abcd"));		//Output : -1
        
        System.out.println("abcd".compareTo("abc"));       //Output : 1
 
        System.out.println("abc".indexOf('c'));        //Output : 2

	}

}
