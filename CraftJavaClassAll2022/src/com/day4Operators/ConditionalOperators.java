package com.day4Operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b;
		a = 20;
		b = (a == 1) ? 30: 40; 
	System.out.println( "Value of b is : " + b ); // result would be 40. this means if a=1 assign the value after :, i.e. 40 to the value of b and if a is not equal to 1 give 40 to the value of b
		
	b = (a == 20) ? 30: 40;
		System.out.println( "Value of b is : " + b ); // result would be 30. this means if a=20 give the first value after ?

	
	}

}
