package com.day7.encapsulation;

public class Account {

	private String accountName;
	private int accountNumber;
	private double accountDeposit;
	private double accountBalance;

	
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountDeposit() {
		return accountDeposit;
	}

	public void setAccountDeposit(double accountDeposit) {
		if (accountDeposit>100) // we can set a condition here for values to be printed under AccountSetterandGetterDemo2 class 
		this.accountDeposit = accountDeposit;
		else {
			System.err.println (" Deposit must be greater than 100)");
		}
		
	}

	public double getAccountBalance() {
		return accountBalance + accountDeposit; // i added accountdeposit beacuse I want to see the total balance when printing under AccountSettlerandGetterDemo2 class
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
