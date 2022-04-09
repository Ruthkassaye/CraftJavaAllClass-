package com.day3Variables;

public class InstanceVariablePractice {

	public String nationality = "Ethiopian";
	public String currentCountry = "USA";

	public void methodone() {

		String firstName = "Nigussie";
		String lastName = "Kassaye";
		int age = 70;

		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		System.out.println ("Nationality :"+ nationality);  // note that this nationality and and currentcountry variables will be printed from instance variable
		System.out.println ("Current Country: "+ currentCountry);
		

	}

	public void methodtwo() {

		String firstName = "Beti";
		String lastName = "Terefe";
		int age = 62;

		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		System.out.println ("Nationality :"+ nationality);
		System.out.println ("Current Country: "+ currentCountry);
	}

public static void main (String [] args) { //creating an object 

	
	InstanceVariablePractice r1 = new InstanceVariablePractice (); // creating of an object 
	
	
	r1.methodone (); // calling inside the class 
	r1.methodtwo (); // // calling inside the class 
	
	
	// lets say i want to print methodtwo and want to change the instance variable I write my new varialble as follows above the calling. see in the above instance variable nationlaity was Ethiopia and i now want to java to change the nationality and print as USA 
		r1.nationality = "USA"; 
		r1.methodone(); // // calling inside the class
	
		
//within one class we can create multiple objects/instance as follows. Note that the each ojbects/instance copy their own instance variable indicated in the class. 
		
		InstanceVariablePractice r2 = new InstanceVariablePractice (); 
		
		r2.methodone (); //note that this instance will keep the original instance variable defined above. it will keep copy if the initial variable defined 

	
		InstanceVariablePractice r3 = new InstanceVariablePractice (); 
		

		

}
}
