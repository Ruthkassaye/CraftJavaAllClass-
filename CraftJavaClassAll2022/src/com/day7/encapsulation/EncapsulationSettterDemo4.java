package com.day7.encapsulation;

import population.EncapsulationSetterDemo3;

public class EncapsulationSettterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationSetterDemo3 emp = new EncapsulationSetterDemo3 ();
		 
		emp.setEmpFname("Happy");
		emp.setEmpLname("Kassaye");
		emp.setEmpAge(40);
		emp.setEmpSalary(100000);
		emp.setEmpBonus(1000);
		
		System.out.println ("Employee first name: " + emp.getEmpFname());
		System.out.println ("Employee last name: " + emp.getEmpLname());
		System.out.println ("Employee age: " + emp.getEmpAge());
		System.out.println ("Employee salary: " + emp.getEmpSalary());
		System.out.println ("Employee bonus: " + emp.getEmpBonus());
		
	}

}
