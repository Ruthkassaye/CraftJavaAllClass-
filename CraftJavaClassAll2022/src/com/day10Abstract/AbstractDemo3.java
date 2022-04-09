package com.day10Abstract;

abstract class Figure1 { // abstract class 
	
	double dim1, dim2; // instance variable 
	
	Figure1 (double a, double b) { //constructor method. Constractor value will be created at the time of object creation 
		dim1 =a; 
		dim2 =b;
}
	abstract double area (); // abstract method 
}
	
	class Rectangel extends Figure1 {

		Rectangel(double a, double b) {
			super(a, b);
			// TODO Auto-generated constructor stub
		} // creating a child class (Rectangle) through inheritance to access the abstract class  

		@Override
		double area() {
			// TODO Auto-generated method stub
			return dim1*dim2; // we can set the return here as dim1*dim2
		}

	}
public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangel r = new Rectangel (10, 10);
		double returnVal = r.area ();
		System.out.println(returnVal);
	}


}