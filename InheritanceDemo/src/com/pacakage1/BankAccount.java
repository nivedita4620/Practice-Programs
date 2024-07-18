package com.pacakage1;
//public class BankAccount extends object
//or
public class BankAccount 
{
	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		super();
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposite(double amount)
	{
		balance = balance+amount;
		//or  balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	public static void main(String[] args) 
	{
		
	}

}
