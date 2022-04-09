package com.day7.accessModifiers;

public class DefaultDemo {

	String name; //here we didn't use access modifier. If we don't specify the access modifier, access modifier would be a Default access modifier type 
	
	void showMethod () {
		System.out.println (name);
		
		DefaultDemo m2 = new DefaultDemo();
		m2.showMethod (); 
	}
}
