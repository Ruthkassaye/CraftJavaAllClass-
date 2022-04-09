package com.day8staticVariables;

public class EmployeeInfo {

	
	static String myname = "Ruth Kassaye"; // static variable
	static int age =31;// static variable
	int salary = 20000;// instance variable
	
	public static void getEmpDetails () {
		System.out.println ("Name: " +myname);
		System.out.println ("Age: "+ age);
//		System.out.println ("Salary: " + salary);// we have error here because salary is not static. Static methods can only access static variables 
	}
	
	public void printEmpDetails () {
		System.out.println ("Name: "+ myname);
		System.out.println ("Age: "+ age);
		System.out.println ("Salary: "+ salary);// here we don't have error because  the method is not static and can accept all variables 
	}



	  public static void main(String[] args) {
		  EmployeeInfo .getEmpDetails();  //  Allowed to call without object creation 
	     //EmployeeInfo.printEmpDetails();   // Not Allowed beacuse 'printEmpDetails'method is instance  
		 
		  EmployeeInfo emp2 = new EmployeeInfo();
		     emp2.printEmpDetails();   // Allowed after creating object


			}
	}

