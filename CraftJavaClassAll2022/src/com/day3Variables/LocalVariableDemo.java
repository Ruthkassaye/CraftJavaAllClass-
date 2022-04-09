package com.day3Variables;

public class LocalVariableDemo {

	public void methodone () {
		
		String fullName = "Happy Kassaye"; // full name and sister here is a local variable
		int     sisAge = 40; // 
		
		System.out.println("Full Name: " + fullName );
		System.out.println ("sister Age: "+ sisAge );
		
	}
	
	public void methodtwo () {
		
		String fullName = "Ruth Kassaye";
		 

		System.out.println ("Full Name"+ fullName);
		//System.out.println ("Sister Age" +sisAge);
		
		
// see I have error here beacause I don't have sisAge in method two. sisAge is only in method one. this kind of variables are local variables
// so to correct this error, i need to define the sisAge variable as follows
		
	
		int     sisAge = 32;
		
		System.out.println ("Full Name"+ fullName);
		System.out.println ("Sister Age" +sisAge);
		
	}
		
// N.B.Remember we can't Run this java code for both methods are under void and not yet in Main Method. So I need to call both methods into the Main 
// Method. To do so we need to create an object and it should be created under the class name above.
		
	public static void main (String [] args) {
		
		LocalVariableDemo r1 = new LocalVariableDemo (); 

// by writing this above code, we have created an object under class LocalVariableDemo. I also have to put the class name to the right first when i create an object 
// and add a reference namer(r1). My reference will let me to refere to the local variables stated in methodone and methodtwo
		
		r1.methodone (); // calling methodone inside the class
		r1.methodtwo (); // calling methodtwo inside the class 
		
	}
		
		
	}

