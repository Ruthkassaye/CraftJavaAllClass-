package com.day8staticVariables;

public class EmpClass1 {
	
	static String city = "New York"; // static variable 
	String name ="Ruth Kassaye";// instance variable 
	int age =31; // instance variable 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpClass1 emp1= new EmpClass1 ();// creating an object 
		
		emp1.city = "Addis Ababa";// beacuse I change the city here the second object also will print Addis Ababa 
		emp1.name = "Happy Kassay";
		emp1.age = 40;
		
		System.out.println("City: " +emp1.city);// print out Addis Ababa
		System.out.println ("name :"+ emp1.name);// print out Happy Kassaye 
		System.out.println ("age: " + emp1.age);// printout age 40 
				
		System.out.println (".............");
		
		
		EmpClass1 emp2 = new EmpClass1 (); // creating an object 
		
		System.out.println ("city: " + emp2.city);// print out Addis Aabba
		System.out.println ("name: " + emp2.name);// print out Ruth Kassaye
		System.out.println ("age: " +emp2.age); // printout age 
		
	}

}
