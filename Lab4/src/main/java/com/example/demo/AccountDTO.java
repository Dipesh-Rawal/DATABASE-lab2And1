package com.example.demo;

public class AccountDTO {
	private int accountNumber;
	private String name;
	private int balance;

	@Override
	public String toString() {
		return "AccountDto [accountNumber=" +accountNumber + ", name= " + name + ", balance=" + balance +"] ";
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
