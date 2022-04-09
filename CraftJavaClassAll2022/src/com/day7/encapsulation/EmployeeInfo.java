package com.day7.encapsulation;

public class EmployeeInfo { // to do Encapsulation the variables should be private and method should be public. Encapsulation helps to hide variables so that no one will change them

	private String empFname = "Ruth";
	private String empLname = "Kassaye";
	private int empAge = 31;
	private double empSalary = 80000;
	private double empBonus = 10000;
	
	// beacuse the above variables are private. i need to give give access to other to read and write using getter and setter option. 
	// right click on a blank space, select 'Source' and select 'Generate getters and setters'. Getters return values and setters give access to set variables value 
	
	
	// getters 
	public String getEmpFname() { 
		return empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public int getEmpAge() {
		return empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public double getEmpBonus() {
		return empBonus;
	}
	
	
}
