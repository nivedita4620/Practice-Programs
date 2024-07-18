package com.interfacedemo;

public class SavingAccount1 implements Bank
{
	private double balance;
	private double interestRate;
	public SavingAccount1(double balance, double interestRate)
	{
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void deposite(double amount)
	{
		balance+=amount;
		System.out.println("Deposited amount is:"+amount);
	}
	
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("Withdraw amount is:"+amount);
		}
		
	}
	
	 public double getBalance()
	 {
		 return balance;
	 }
}
