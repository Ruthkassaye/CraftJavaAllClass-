package com.day5.ifelse;

import java.util.Scanner;

public class IfStmtsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number 1 99999");

		int number = input.nextInt(); 

		if (number < 10 && number >= 1) {  // if the first condition is true it wont check the below conditions

			System.out.println("Its is one digit number");
		}

		else if (number < 100 && number >= 10) {

			System.out.println("Its a two digit number");

		}

		else if (number < 1000 && number >= 100) {

			System.out.println("Its a three digit number");
		}

		else if (number < 10000 && number >= 1000) {

			System.out.println("Its a four digit number");
		}

		else if (number < 100000 && number >= 10000) {

			System.out.println("Its a fivedigit number");
		}

	}
}