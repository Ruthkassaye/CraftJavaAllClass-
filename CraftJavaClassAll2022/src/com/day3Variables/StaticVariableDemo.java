package com.day3Variables;

public class StaticVariableDemo {

	public static double salary; // static variables 
	public static String dept = "Finance"; // static variable 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariableDemo.salary =4000; // for static variables i don't need to create an object to access the static variable 
		StaticVariableDemo.dept= "Finance"; 
		
		System.out.println("Dept:" + dept);
		System.out.println("Salary:" + salary);
	}
}
