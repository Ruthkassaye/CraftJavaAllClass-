package com.day6Array;

public class MultiDimensionalDemo1 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks [][] = {
				           {50, 65, 70},  // row= 0 // 185
				           {55, 68, 75},  // row= 1// 198
				           {57, 61, 78},  // row= 2 //196
				           {59, 60, 71},   // row= 3 //190
	                       }; // total  index  row= 0-3, column =0-2

		
//		for (int i=0; i<marks.length; i++) {// iterate over a row
//			for (int k=0; k<marks[i].length; k++) // iterate over a column 
//
////			System.out.print(marks[i][k] + " ");

//		}
	
//		// 1) Calculating sum and average of marks columns
		
		
//		int columnTotal= 0;
//		double avg;
//		for (int i=0; i < marks.length; i++) {
//			columnTotal = columnTotal + marks[i] [2]; // modify the number of column you want to anaysis not the result would be column 2
//		
//		}
//		 avg = columnTotal/4;
//		 
//		System.out.println("Total student sum:" + columnTotal);
//		System.out.println("Average student mark: " + avg);
		
		
		
		// 2) Calculating sum and average of marks rows
		
	
		
		int rowTotal = 0;
	
		double avg;
		for (int i=0; i <3; i++) {
			for (int k=0; k<2; k++);
			
			rowTotal = rowTotal + marks [1] [i];	//modify the number of row you want to anaysis not the result would be row 1
			
		}
		
		   avg = rowTotal/3;
		
		System.out.println("Total mark of student A : " + rowTotal);
		System.out.println("Average mark of student A : " + avg);
		
	}
	
}
