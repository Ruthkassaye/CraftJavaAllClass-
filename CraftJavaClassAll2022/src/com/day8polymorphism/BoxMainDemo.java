package com.day8polymorphism;

public class BoxMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BoxDemo b1 = new BoxDemo (); // calling the first constructor under BoxDemo class 
		BoxDemo b2 =new BoxDemo (5,10, 15); // calling the second constructor under BoxDemo class 
		
		
		System.out.println (b1.volume());
		System.out.println (b2.volume());
		
		
	}

}
