package com.day11Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap   emp = new HashMap (); // hover over Hashmap and import hashmap java.util
		                                                
		// note that if I have repeated values in Map it won't be printed out. Because we use Set to iterate the data and Set doesn't print repeated values 
		
		emp.put("Name", "Shilemat");// Java HashMap contains values based on the key. key is name and value is here Shilemat 
		emp.put("age", 30);
		emp.put("Salary", 5000);
		
//emp.remove("Salary");// if I want to delete "Salary"
		
//to print out HashMap using iterator we need first to change the hashmap to Set
		
		Set s = emp.entrySet (); // I have to import Set first. 
		
		Iterator i = s.iterator(); // we only use iterator to print out from HasMap; for loop won't work here 
		
		while (i.hasNext()) {
			
		Map.Entry e = (Map.Entry) i.next(); 
			
//	System.out.println(e.getKey()); // If I want only key values
//	System.out.println(e.getValue());// if I also want values of each key value
			
//I can also print out in this way	
		
	   System.out.println(e.getKey() +" " + e.getValue());
			
		}
	
	}   
 
}
