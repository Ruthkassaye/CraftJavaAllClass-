package com.day8polymorphism;


	class Animal {
		
	void eat () {
	System.out.println("Animal eating.. ");
		}
	}
	class Dog extends Animal {
		
		
		@Override    // this is optional. it is just indicating that this class is doing method overriding 
		void eat () { // has the same method as declared in the parent class
			
		System.out.println("Dog eating"); // Dog class here is implementing a specific method that has been declared by the parent class above, this process is known as method overriding. 
	                                 // this class will print its own specific 'dog eating' rahter than animal eating in the parent class
		    }
		}
	
	public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog (); // creating an object for
		d.eat();
		

		
	}

}
