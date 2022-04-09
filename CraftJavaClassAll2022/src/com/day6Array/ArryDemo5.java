package com.day6Array;

public class ArryDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] studMark = { 67, 78, 80, 95, 55, 77, 56};
		
		calcStudMark(studMark); // creating calc method to run the sum and average in differnt methods 
	}

	private static void calcStudMark(double[] studMark) {
		// TODO Auto-generated method stub
		
		double sum=0;
		double avg;
		
		
//		//accessing arry using for loop
//		
//		for(int i=0; i<studMark.length; i++){
//		sum= sum + studMark[i];
//	}
		
		// accessing arry using for each method 
		
		for (double element: studMark) {
			sum= sum+element;
			
	}  		
        avg = sum/studMark.length;
        System.out.println("Total mark of student: " + sum);
        System.out.println ("Total mark of student: " + avg);
        
	   
}
}