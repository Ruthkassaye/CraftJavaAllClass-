package com.day4Operators;

public class Arithmetic_operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b, c; //this is called a declaration 
		a =10; // value initializing 
		b= 2; // value initializing 
		
		c= a +b; // adds two operands 
		
		System.out.println("Addition: " +c);
		
		c= a-b; // subtract second operands from first
		
	   System.out.println ("Substraction: " + c);
	   
	   c = a*b; // multiply two operand

	   System.out.println (" Multiplication: " + c);
	   
	   c= a/b; // divide numerator by denumerator

	   System.out.println ("Division: " + c);
	   
	   b= 3;
	   c =a%b; // remainder of division
	   
	   System.out.println ("Remainder: " + c);
	   
	   c= ++a; // prefixIncrement operator increases integer value by one
	   
	   System.out.println ("Prefixincrement Operator: " + c);
	   
       c= a++; // postfixIncrement operator increases integer value by one
	   
	   System.out.println ("Postfixincrement Operator: " + c);
	   
	   c= --a; // Decrement operator decreases integer value by one

	   
	   System.out.println ("Decrement Operator: " + c);
	}

}
;