package com.day8inheritance;

class Animaltwo {
	
	Animaltwo (){ // constructor 
		System.out.println("From animal class");
	}
	void sound() { // method one 
		System.out.println("animal sound...");
	}
}

class Dog2 extends Animaltwo {
	
	Dog2 (){
		
		System.out.println("From dog class"); //Whenever you create the instance of subclass (class Dog2 in this case), an instance of parent class (class Animaltwo) is created implicitly which is referred by super reference variable.

	}

	@Override  // Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
	void sound() { // method two
		System.out.println("bark bark...");
	}

	void display() {  // method three
		sound();
		super.sound(); // I use supper if I want to print out a variable which is used in the immediate parent class object
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog2 d = new Dog2();
		d.display(); // bark bark will bark bark will be printed 

	}

}
