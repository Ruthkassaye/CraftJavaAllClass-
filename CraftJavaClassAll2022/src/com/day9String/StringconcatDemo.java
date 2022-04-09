package com.day9String;

public class StringconcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String fullname = "Ruth";
		System.out.println(fullname.concat (" Kassaye"));// concat helps here to print out the first string variable (Ruth) with the second (Kassaye)
       
//		System.out.println(fullname);// if I printout fullname, I still get Ruth not Ruth Kassaye
		
		fullname =fullname.concat(" Kassaye"); // if I want to print out together Ruth Kassaye 
	}

}
