package com.day11Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	HashSet a = new HashSet ();// it is the same like arrylist,linked list, vector, stack 
//		 LinkedHashSet a = new LinkedHashSet ();// same like Hashset, print out result are the same. LinkedHashset is faster 
		 TreeSet a= new TreeSet ();// also same like Hashset and linkedhashset 
		 
		a.add("Ruth"); // to add data in HashSet
		a.add("Ruth"); // Hashset doesn't print out repared variables 
		a.add("Kassaye");
//		a.add(31); // but in treeset this wont be printed out
//		a.add(true); // but in treeset this wont be printed out
		
		Iterator i= a.iterator();
		while (i.hasNext())
		System.out.println(i.next()); // result would be Ruth Kassaye 31 true
		
		
	}

}
