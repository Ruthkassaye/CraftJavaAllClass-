package com.day12Pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer c= new Customer (); // creating an object and adding file into the Customer class. 
		c.setAge(12);
		c.setName("Kebede");
		c.setSalary(6000);

		Customer c1 = new Customer ();// creating an object and adding file into the Customer class.
		c1.setAge(31);
		c1.setName("Ruth");
		c1.setSalary(7000);
		
// 	storing the above two objects into an ArrayList 
		
		ArrayList <Customer> a = new ArrayList ();
		a.add(c);
		a.add(c1);
		
		for (Customer cu:a) {
			System.out.println(cu.getAge() + " "+ cu.getName() + " "+ cu.getSalary());
			
			
		System.out.println("......");	
			
//using Hashmpa
			
			
			HashMap h = new HashMap ();
			
			h.put("customer1", c);
			h.put("customer2", c1);
			
			Set s = h.entrySet ();
			Iterator i = s.iterator();
			while (i.hasNext()) {
				Map.Entry m = (Map.Entry)i.next();
				Customer cust = (Customer) m.getValue();
				System.out.println(m.getKey() + " " + cust.getName() + " " + cust.getAge());
			}
			
			
		}
	}

}
