package com.day10Abstract;


	public class Main {

		public static void main(String args[]){

		try{

		int a =5 /0;

		System.out.print("TRY");

		}

		catch(ArithmeticException e){

		System.out.print("CATCH");

		}

		}

		}
