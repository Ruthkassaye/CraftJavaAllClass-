package com.day2IntroJava;

import java.util.Scanner;

public class ScannerDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("please enter your name: ");
		String empName =in.next ();
		
		System.out.println ("please enter your age: ");
		int empAge = in.nextInt ();
		
		System.out.println ("please enter your salary: ");
		double empSalary =in.nextDouble ();
		
		
		System.out.println ("Please enter your bonus");
		double empBonus =in.nextDouble ();
		
		System.out.println ("Please enter your total salary");
		Double totalSalary =empSalary + empBonus;
		
		System.out.println ("Employee Name: " + empName);
		System.out.println ("Employee Age: "+ empAge);
		System.out.println ("Employee Salary:" +empSalary);
		System.out.println ("Employee Bonus: " + empBonus);
		System.out.println ("Employee total Salary: "+ totalSalary);

	}

}
