package com.day5.branchingStmts;

public class BreakDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i ++) {
			if (i==8) break;
			
			System.out.println(i + " "); // it will print 1-7 beacuse we told the system to break when it reaches at 8
		}
		
	}

}
