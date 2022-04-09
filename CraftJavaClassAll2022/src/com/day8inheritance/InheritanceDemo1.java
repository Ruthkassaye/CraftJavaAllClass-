package com.day8inheritance;


class GrandParent  {
	void fun () {
	System.out.println("Kassaye...");
	}
}


class Parent extends GrandParent {
	void fun () {
	super.fun();
	System.out.println ("Negussie..");
}
}


class Child extends Parent{
	
	void fun () {
	super.fun (); //if i want to print out Negussie from the parent class i should add "extends' on the class and add super just before System.out.println("Ruth");	
	System.out.println("Ruth");	
		
	}
}


public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c= new Child ();
		c.fun(); // this will pring only Ruth from the child class. if i want to print parent classes i need to go above and add super 
		
	}

}
