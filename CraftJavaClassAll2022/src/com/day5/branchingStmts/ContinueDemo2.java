package com.day5.branchingStmts;

public class ContinueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i<10) {
			if (i ==5) {
				 i++;
				continue;
				}
		System.out.print(i); //it will print from 1-9 jumping number 5
		i++;
		}
		
		
	}

}
