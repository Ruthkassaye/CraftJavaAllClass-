package com.day8inheritance;

class OuterClass {
	int x =10;
	
	 class InnerClass{
		int y=20;
		
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass m1 = new  OuterClass ();
		 
		OuterClass.InnerClass m2 = m1. new InnerClass();
         System.out.println("Inner: " +  m2.y  + "Outer: " +  m1.x);
	}

}
