package com.day4Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b = 10;
		int c = 0;
		c = a + b;
		System.out.println("c = a + b = " + c); //40 c=a+b c= 30+10
		c += a;
		System.out.println("c += a = " + c);// 70 c= a+c  c= 40+30
		c -= a;
		System.out.println("c -= a = " + c); // 40 means c= c-a  c= 70-30
		c *= a;
		System.out.println("c *= a = " + c); // c= c*a  c= 40*30= 1200
		a = 20;
		c = 25;
		c %= a;
		System.out.println("c %= a = " + c); // c= c% a c= 25%20 =5

	}

}
