package com.day7.encapsulation;

public class BoxDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box (); // creating an object.Note that we haven't created the variables here. the variables are set in Box class and we are accessing the variables through constructor  
                              //	if values are not set in the constructor under the Box class, we can also create the values here as follows 	Box b1 = new Box (10, 10, 10)
		double vol = b1.volume ();
		
		System.out.println (vol);

	}

}
