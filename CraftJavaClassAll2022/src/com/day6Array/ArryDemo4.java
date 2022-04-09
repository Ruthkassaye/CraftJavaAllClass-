package com.day6Array;

public class ArryDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] studMark = { 67, 78, 80, 95, 55, 77, 56};
		
		// to find sum and average mark of students. to do so first we need to define the Sum as follows
		
		double sum = 0; // declariation
		double avg;
		
//		// using for each
//	        for (double elt: studMark) {
//	        	sum= sum +elt;
//	        }
		
//		using for loop
		
		for(int i=0; i<studMark.length; i++) {
			sum= sum + studMark [i];
		}
		
	    avg =sum/studMark.length;   // or sum/studentMark.length;
	    
        System.out.println("Total mark of student" + sum);
        System.out.println ("Total mark of student: " + avg);
        
        }
}
	

	

	