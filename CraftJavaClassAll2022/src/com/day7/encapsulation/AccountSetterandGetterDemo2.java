package com.day7.encapsulation;

public class AccountSetterandGetterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account ();
		
		acc.setAccountName("Ruth");
		acc.setAccountNumber(1234567);
		acc.setAccountDeposit(100); // remember we have set a condition in the Account class that deposit value need to be >100
		acc.setAccountBalance(2000);
		
		System.out.println ("Account Name: " + acc.getAccountName());
		System.out.println("Account Number: " + acc.getAccountNumber());
		System.out.println ("Account Deposit " + acc.getAccountDeposit());
		System.out.println ("Account Balance " + acc.getAccountBalance());
		
		
	}

}
