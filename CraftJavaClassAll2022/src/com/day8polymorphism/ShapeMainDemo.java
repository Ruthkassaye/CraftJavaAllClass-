package com.day8polymorphism;

public class ShapeMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading m1 =new MethodOverloading (); // creating an object. we are accessing the class ShapeDemo through m1. we can access the class beacuse we are in the samepackage and the class a default method type 
		System.out.println(m1.clacArea(10));
		System.out.println(m1.calcArea(4, 8, 8));
		
		
		
	}

}
