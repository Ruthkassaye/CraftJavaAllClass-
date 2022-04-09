package com.day10Abstract;

abstract class Figure{
	abstract void calcArea(double length);

}

 class FigureImp extends Figure { // FigureImp is now a child class and is responsible to provide an implementation to its parent abstract method 
 
 @Override
void calcArea(double length) {   // to add an imp
	// TODO Auto-generated method stub
     
	 double result = length * length;
	 
     System.out.println("Area of rectangle is:"  + result);
     
}

 } 

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Figure f = new Figure ();// There is an error here, bacause If a class is declared abstract, it cannot be instantiated; it means no object creation.
		                          // To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
		                          // hence I have created class FigureImp which extends/inherits class Figure, see above 

		
		
		Figure f = new  FigureImp (); // now the object is created through the concrete class/normal class which is the child class 
		
		f.calcArea(10); // result would be 100
	}

}

