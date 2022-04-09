package com.day5.branchingStmts;

public class ContinueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=10; i++) {
			if (i==8)continue; // only skip a single iteration or step of the loop
			
			System.out.print(i + " ");
		}
		
	}

}
