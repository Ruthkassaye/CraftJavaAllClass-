package com.day7.encapsulation;

public class EncapsulationGetterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeInfo emp = new EmployeeInfo (); // creating an object 
//		emp.empAge(); // now I am trying to access empAge which is found under EmployeeInfo class 

		
		// but i can print empAge value beacuse getter has been established for it in the EmployeeInfo class
		
		System.out.println ("Employee first name: " + emp.getEmpFname());
		System.out.println ("Employee last name: " + emp.getEmpLname());
		System.out.println ("Employee age: " + emp.getEmpAge());
		System.out.println ("Employee salary: " + emp.getEmpSalary());
		System.out.println ("Employee bonus: " + emp.getEmpBonus());
		System.out.println("Employee first name:" + emp.getEmpAge());
		
	}

}
