package com.day6Array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] salaryofStudent = {1000, 2500, 50, 4000, 2000, 3000}; // we don't need to store values for each index. index will be automatically assigned for each value. E.g., index o will be 1000, indext 1 will be 2500 etc 
		
		
		//accessing array using for loop
		
//		for (int i=0; i<salaryofStudent.length; i++) {
//			System.out.println(salaryofStudent [i]);
//		}
		
		
		//accessing array using for each
		
		for(double element: salaryofStudent) {
			System.out.println (element);
		}
	
	}

}
