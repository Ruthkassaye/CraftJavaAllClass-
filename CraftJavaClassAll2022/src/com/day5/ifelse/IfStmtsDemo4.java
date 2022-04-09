package com.day5.ifelse;

import java.util.Scanner;

public class IfStmtsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println ("Please enter your number: ");
		int value = in.nextInt();
		
		if(value%2 !=0) {
			System.out.println("You enetered odd numbers");
			
		}
		else {
			System.out.println("You enetered even number");
		}
	}

}
