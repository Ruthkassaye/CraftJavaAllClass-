package com.day5.ifelse;

public class NestedIfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 25;
		int weight =70;
		if (age >=18) {
			if (weight > 50) {
				System.out.println ("You are eligible");
			}
		}
		else {
			System.out.println("You are not eligible");
		}
	}

}
