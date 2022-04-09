package com.day7.encapsulation;

public class Box {
	
	int width;
	int height;
	int depth;
	
	
	// creating constructor 
	
	Box (){
		width = 10;
		height = 10;
		depth = 10;
		
	}
	
	double volume() {
		int result = width*height*depth;
		return (double) result;
		
		
		
	}
	

}
