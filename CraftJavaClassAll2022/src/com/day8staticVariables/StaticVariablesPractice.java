package com.day8staticVariables;

public class StaticVariablesPractice {
	

static int z;
	
	public static void addition (int x, int y) { // method one. This method need to be static to access the variable because  the static variable can only be access by static methods 
	 z = x+y;
		System.out.println("The sum of the given numbers : " + z);  
	}
	
	public static void substruction (int x, int y) { // method two 
		z= x-y;
		System.out.println("The difference between the given numbers " + z);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//we printout method one without creating an object because the method is static.
//		syntax to call a static method without creating an object classname .methodname();

		StaticVariablesPractice .addition(10, 20); //the result is 30.    	
		StaticVariablesPractice .substruction(10, 8);
		
	}

}
