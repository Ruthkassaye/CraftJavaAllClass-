package com.day11Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// ArryList collection type. Accept hetrogeneous data type, it is flexiable you can add as much as data you want 
		
		ArrayList emp = new ArrayList ();// you will have an error pm ArrayList hover over it and select Import 'ArrayList' (java.util)
	// also you can use LinkedList instead of ArrayList.It is the same function and the difference between them is behind the scene 
//		LinkedList emp = new LinkedList ();// use this if you want to use LinkedList instead of ArrayList 
//		Vector emp = new Vector ();// vector is also same like Arraylist and linked list. same method to add, remove and print out variables 
		
		emp.add("Ruth");  // to add data in ArryList
		emp.add("Kassaye");
		emp.add(31);
		emp.add(true);
		
//		 emp.remove(0); // if I keep this code it will delte for me variable at index 0, i.e. Ruth
		 
     Iterator i= emp.iterator();// creating  loop. i is iterator name 
     
     while (i.hasNext ()) { // print out all until i has next value 
    	 System.out.println(i.next());//  print out will be Ruth Kassaye 31 true 
     }
     

     
     System.out.println("..............");
     
   // to remove a variable 
     
     ArrayList custName = new ArrayList ();
     
     custName.add("Abebe");
     custName.add("Chala");
     custName.add(44);
     
     Iterator cus = custName.iterator();
     while (cus.hasNext()) {
    	 System.out.println(cus.next());
     }
    
   
     
     System.out.println("..............");// I used this to break the above coding from the below when printout it will give some space 
     
// If i want to strict the data type to be enetered
		
		ArrayList <Integer> emp1 = new ArrayList ();
		

		emp1.add(500); 
		emp1.add(330001);
		
		for (int a:emp1) { // for each is used only to print out when we our data type is identical/integer 
			System.out.println(a);
			
//if I want to Delete a variable for an array list 
			
//			System.out.println(emp1.remove(0)); // result would be 500. meaning 500 is being removed 
			
		}
 
		
	}
}

