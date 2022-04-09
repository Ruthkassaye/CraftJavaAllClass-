package com.day8polymorphism;

public class MethodOverloading {

	// polymorphism is in Java is a concept by which we can perform a single action
	// in different ways.
	// We can perform polymorphism in java by method overloading and method
	// overriding.
// If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	// The following example shows Method Overloading example. There are 3 methods
	// with the same method name, calcArea but having different parameters

	public double clacArea(double height, double width) { // calcArea method 1 with 2 parameters
		double rectArea = height * width;
		return rectArea;

	}

	public double clacArea(int radius) { // calcArea method 2 with 1 parameters
		double circleArea = 3.14 * radius * radius;
		return circleArea;

	}

	public double calcArea(double height, double width, double depth) { //// calcArea method 3 with 3 parameters
		double triArea = height * width * 0.5;
		return triArea;
	}
	
	 MethodOverloading(int length, int width) { // constructor method. 
		
	}
	
	 MethodOverloading() { // constructor method. 
		
	}
	

	 MethodOverloading(int length){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		MethodOverloading calc = new MethodOverloading ();  // creating an object for SapeDemo class 
////		
//		System.out.println("Triangle Area:  " + calc.calcArea(2, 3, 4)); // compile-time polymorphism means we are adding values at the time of excution 
//		System.out.println("Circle Area:  " + calc.clacArea(5));
//		System.out.println("Rectangle Area: " + calc.clacArea(5, 5));
////		
	
//		MethodOverloading c = new  ?? Ask Soressa/Minte 
		
	}
}