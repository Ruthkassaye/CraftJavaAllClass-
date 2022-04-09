package com.day11Collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue a =new PriorityQueue ();
 
		a.add("Ruth"); // to add data
		a.add("Ruth"); 
		a.add("Kassaye");

//			a.poll(); // to remove. first the priority given variable would be removed, Kassaye followed by the next variabel,i.e. Ruth
//		    a.poll ();
		
		Iterator i= a.iterator();
		while (i.hasNext())
		System.out.println(i.next()); // in PriorityQueue variables will be printed out in order given behind the scene algorism. Result would be Kassaye, Ruth Ruth
	//	System.out.println(a.peek()); to know which object has been given a priority , result is Kassaye
//		System.out.println(a.element());// to know which element has been given a priority , result is Kassaye
	
		
System.out.println("............");		

/*ArrayDeque class: Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.*/
		
		
		ArrayDeque x = new ArrayDeque (); // there will be a red underline, hover over ArrayDeque and import ArrayDeque java.util 
		
		x.add("Lidia");
		x.add("Debe");
		x.add("Sami");
		x.add("Noha");
		
//		x.poll();// to remove. first the priority given variable would be removed, result would be Debe. Sami Noha. if i remove this comand line the result would be all including Lidia 
		Iterator y = x.iterator();
		while (y.hasNext())
		
	System.out.println(y.next());
	}
}

