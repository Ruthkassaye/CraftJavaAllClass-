package com.day5.branchingStmts;

public class ReturnDemo2 {

	int Addition (int a, int b) {
	
    int result =a+b;
	return result;
	}
	
	double Division (int a, int b) {
		return a/b;
	}
	
	String displayName(String name) {
	return name;
  }
	
	void showMethod () {
		System.out.println ("From show Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnDemo2  m1 =new ReturnDemo2 (); // creating an object 
		
        System.out.println (m1.Addition(10, 10));
        System.out.println (m1.displayName("Ruth"));
        m1.showMethod ();
	}

}
