package com.day8inheritance;


class Claculation { // class one
	
	 int z;
	
	public  void addition (int x, int y) { // method one. This method need to be static to access the variable because  the static variable can only be access by static methods 
	 z = x+y;
		System.out.println("The sum of the given numbers : " + z);  
	}
	
	public  void substruction (int x, int y) { // method two 
		z= x-y;
		System.out.println("The difference between the given numbers " + z);
	}
}

class My_Calculation extends  Claculation { // class two // adding 'extends' so that this class will copy the methodbody/code from the above Calculation class 
	
//	int z;
//	
//	public void addition (int x, int y) { // method one
//		z= x+y;
//		
//	System.out.println("Print sum of the given numbers : "+ z);
//	}
//	
//	public void Substruction (int x, int y ) {
//		z= x-y;
//		System.out.println("The difference between the given numbers: " +z);
//	}
//	the above code are the same with the above class called Claculation. This is called code duplication. 
//	so we can reuse the above code through inheritance mechanism by adding 'extends' on the class name, see above. remember inheritance helps us for code reuseability 
//	so this class will have addition, substruction form the above class and perform its Multiplication method 
	
	public void Multiplication (int x, int y) { // this is a unique method  My_Calculation class has compared to the above class 
		z = x*y;
		System.out.println("The product of given numbers: " + z);
	
	}
}

class My_Calculation2 extends My_Calculation { // this is called multilevel inheritance. Beacuse My_Calculation2 class inherits My_Calculation class and My_Calculation inherits Calculation class 
                                               // this specific class will perfrom addition, substruction , multiplication because it is a child of class B and Class B is also a child of A 
     public void Division (int x, int y) {
    	 z= x/y;
    	 System.out.println("The division of given numbers: "+ z);
     }
}
public class InheritanceDemo {
	public static void main (String []args) {
		
//		Claculation calc = new Claculation (); // we need to create first an object to to print out class because the class is not static 
//		calc.addition(10, 20);
//		calc.substruction(80, 40);
		
		
//		My_Calculation calc2 = new My_Calculation ();// creating an object to printout My_Calculation class 
//		
//		calc2.addition(2, 3);
//		calc2.substruction(10, 5);
//		calc2.Multiplication(10, 10);
//		
		My_Calculation2 calc3 = new My_Calculation2 (); // creating an object to printout class 3 
		
		calc3.addition(4, 5);
		calc3.substruction(10, 5);
        calc3.Multiplication(10, 10);
		calc3.Division(40, 10);

		
	}
		
	}



