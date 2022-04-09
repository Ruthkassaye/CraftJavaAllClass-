package com.day5.ifelse;

import java.util.Scanner;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner (System.in);
        System.out.println("please eneter your age: ");
        int age = in.nextInt();
     
        
        System.out.println("please eneter your weight: ");
        int weight = in.nextInt ();
 
        System.out.println("please eneter your salary: ");
        double salary = in.nextDouble ();
        
		if (age >=18) {
			if (weight > 50) {
				System.out.println ("You are eligible");
			}
			if (salary< 80000) {
				System.out.println ("You are eleigible");
			
			}
		}
		else {
			System.out.println("You are not eligible");
		}
        
	}

}
