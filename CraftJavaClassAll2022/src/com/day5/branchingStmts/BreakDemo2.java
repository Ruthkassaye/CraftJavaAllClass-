package com.day5.branchingStmts;

public class BreakDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1;
		do { 
			if  (i==15) {
				i++;
				break; // it will be printed up to 14. The break will stop it at 14 if i replace break with continue, then it will be printed 1-20 and only jump number 15
			}
		System.out.println (i); 
			i++;
			
		} while (i<=20);
		
		
	}

}
