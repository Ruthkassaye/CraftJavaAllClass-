package com.day10Abstract;

public class MammalInt implements Animal{  // When a class implements an interface, you can think of the class as signing a contract, 
                                      //agreeing to perform the specific behaviors of the interface. If a class does not perform 
                                           //all the behaviors of the interface, the class must declare itself as abstract.
                                           //A class uses the implements keyword to implement an interface. 
                                           //The implements keyword appears in the class declaration following the extends portion of the declaration.


//	@Override
//	public void eat() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void travel() {
//		// TODO Auto-generated method stub
		
	
		public void eat () {
			System.out.println("Mamal eats");
			}
		
		public void travel () {
			System.out.println("Mamal travels");
			
		}
		
		public int noOfLegs () {
			return 0; 
		}
//	@Override
//	public void bark() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("bark");

	}


