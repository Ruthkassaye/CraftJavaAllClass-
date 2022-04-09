package com.day5.ifelse;

import java.util.Scanner;

public class IfStmtsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in =new Scanner (System.in);
		
		System.out.println("Please enter your mark: ");
		double mark = in.nextDouble ();
		
		String Grade; 
		
		if (mark<100 && mark>90) {
			Grade = "A+";
		}
		
		else if (mark <90 && mark>=80) {
			Grade= "A";
		}
		
		else if(mark<80 && mark>70) {
			Grade = "B";
		}
		
		else if(mark<70 && mark>60) {
			Grade = "C";
		}
		
		else if(mark<60 && mark >50) {
			Grade = "D";
			
		}
		
		else {
			Grade = "NG";  // this would be the default value of all the above conditions are false 
		}
		
		System.out.println ("Student grade: "+  Grade);
	}

}
