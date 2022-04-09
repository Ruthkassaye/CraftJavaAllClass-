package com.day8inheritance;


class Animalone { // class one 
	String color = "White";
	
}

class Dog extends Animalone { // class two
	String color = "Black";
			
	void display () { // method 
//		System.out.println("Color: " + color);
		System.out.println("Color: "+ super.color); // be used to refer immediate parent class instance variable
	}
}




public class MethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog d =new Dog ();
		d.display();
	}

}
