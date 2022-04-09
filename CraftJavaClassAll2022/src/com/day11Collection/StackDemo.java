package com.day11Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack emp = new Stack ();
		
		
		emp.push ("Ruth");// // to add data in the Stack 
		emp.push ("Kassaye");
		emp.push (31);
		emp.push(true); 
		
//		System.out.println(emp.pop());// result would be the last variable added, i.e. true in this case
		
		Iterator i = emp.iterator(); //  will print out all in order, Ruth Kassaye 31 true
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	
		
		 System.out.println("..............");
		
		 Stack<Integer> emp2 = new Stack (); // here only integer data type is allowed to be inserted 
			
			
			emp2.push (50);// // to add data in the Stack 
			emp2.push (100);
			emp2.push (150);
			emp2.push(200); 
			
			for (Integer m: emp2) { // use for loop when data type is the same here we have the same data type. i.e int 
				System.out.println(m);
			}
		
	}

}
