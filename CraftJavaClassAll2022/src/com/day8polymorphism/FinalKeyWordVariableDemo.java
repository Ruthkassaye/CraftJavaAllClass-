package com.day8polymorphism;

public class FinalKeyWordVariableDemo {
	
	
	final int MIN =0;  // If you make any variable as final, you cannot change the value of final variable(It will be constant).

	 int MAX =5;
	static final double PI = 3.14;
	
	
//	public void changeMax (int x) {
//		
//		MAX = 100;
//		System.out.println("updated max value: " + MAX);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyWordVariableDemo f = new FinalKeyWordVariableDemo ();
		System.out.println(f.MAX);
		System.out.println(f.MIN);
		System.out.println(f.PI);
	

	
		

	}

}
