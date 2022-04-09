package com.day8polymorphism;

public class BoxDemo {

	
	double width; // these are instance variables or global variables 
	double height;
	double depth;
	
	
	BoxDemo (){ // first constructor with no parameter 
		width =5;
		height =10;
		depth = 3;						
	}
	
	BoxDemo (double w, double h, double d){ // // first constructor with parameters 
		width =w;
		height =h;
		depth =d;
	}
	
	double volume () {
		return width*height*depth;
	}
	
}
