package com.day8staticVariables;

public class staticClass3 {

	static int height =34;
	static int weight =70;
	
	public static void printPersonalDetails () {
		System.out.println ("weight of person: " + weight);
	}

	
	
	public class staticClass3Main {
	
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
//System.out.println("Height of person:" + staticClass3.height);
		
//		staticClass3.printPersonalDetails();
//		
//		staticClass3.weight = 75;
//		
//		staticClass3.printPersonalDetails(); 

		staticClass3.printPersonalDetails();
	}

}

}
