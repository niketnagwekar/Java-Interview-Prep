package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMapExample {

	public static void main(String[] args) {

		HashMap<String, Double> map = new HashMap<String, Double>();

		// Adding some elements to HashMap

		map.put("Ashwin", 87.55);
		map.put("Bharat", 95.65);
		map.put("Chetan", 68.13);
		map.put("Dhanjay", 74.23);
		map.put("Kartik", 65.42);
		
		//HashMap can have one null key and multiple null values
        
        map.put(null, null);
         
        map.put("Sandesh", null);
        
        System.out.println("Size Of The Map : "+map.size());
        
        System.out.println("-----------------");
        
      //Displaying the elements
        
        System.out.println("The elements are :");
        
        Set set = map.keySet();
        
        Iterator keySetIterator = set.iterator();
        
        while(keySetIterator.hasNext()) {
        	Object key = keySetIterator.next();
        	System.out.println(key + " : "+ map.get(key));
        }

        System.out.println("-----------------");
        
        //Checking the map for a particular key/value
        
        System.out.println("Does this map has Chetan as key? "+ map.containsKey("Chetan"));
        System.out.println("Does this map has 74.23 as value? "+map.containsValue(74.23));
        
        System.out.println("-----------------");
        
        //Removing an element from the map
         
        System.out.println("Value removed from the map : "+map.remove("Kartik"));
        System.out.println("-----------------");
        System.out.println(map.values());
        
        System.out.println("-----------------");
        
        for (Map.Entry<String, Double> entry : map.entrySet()) {
        	System.out.print("KEY =" + entry.getKey());
        	System.out.print(" VALUE = " + entry.getValue());
        	System.out.println();
			
		}
        System.out.println("-----------------");
        Iterator<Entry<String, Double>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
        	Entry<String, Double> ent = iterator.next();
        	System.out.print("KEY = " + ent.getKey() + " VALUE = "+ent.getValue());
        	System.out.println();
        }
	}

}
