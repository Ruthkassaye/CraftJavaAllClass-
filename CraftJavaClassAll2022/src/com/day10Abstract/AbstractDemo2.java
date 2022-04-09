package com.day10Abstract;


abstract class A {
	
	abstract void callme (); // abstract method 

    void callmetoo () {
    System.out.println("This is a concrete method"); // concrete method
    }
    }

class B extends A {
	void callme () {
		System.out.println("Implementation of callme by object B");
		
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B b = new B();
		b.callme();
		b.callmetoo(); //accessing abstract class through the child concrete class 
		
	}

}
