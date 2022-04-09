package com.day9String;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String fullName = "Ruth Kassaye"; // // creating string using String Literal. It is the same like above 
//		
//		String companyName = "Perspectives"; // String using String Literal
//
//		String country  = new String  ("Ethiopia"); // creating String using new keyword. It is the same like above 
//		
//		System.out.println();
//		
//		System.out.println("Full Name: " + fullName);
//		System.out.println("CompanyName: " + companyName);
//		System.out.println("Origin:  " + country);
//		
		
//		Example two: Note Strings are immutable. This means once you create a String you cannot change its content.


//		String fullname = "Ruth Kassaye";
//		String parentname = "Ruth Kassaye";
//		
//	   System.out.println(fullname == parentname); // print out will be true. This syntax is checking if these two variables are directing towards the same object not if the string variables are identical 
	
	
//	If I create one of the Strings using new keyword then 
	   
	   String AUcity = "Addis Ababa";
	   String capitalcityEthiopia = new String ("Adddis Ababa"); // when we create String using String Literal 
	   
	   System.out.println(AUcity == capitalcityEthiopia); // ==  cehck if two objects are the same. Result will be false in this case; meaning the strings are not directing to the same object 
	
	}

}
