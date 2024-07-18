package com.interfacedemo;

public class CurrentAccount1 implements Bank
{
	private double balance;
	private double overdraftLimit;
	public CurrentAccount1(double balance, double overdraftLimit) {
		super();
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}
	public void deposite(double amount)
	{
		balance+=amount;
		System.out.println("Deposited amount is:"+amount);
	}
	 public double getBalance()
	 {
		 return balance;
	 }
}
