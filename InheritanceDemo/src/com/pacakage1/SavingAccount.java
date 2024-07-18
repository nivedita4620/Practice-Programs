package com.pacakage1;

public class SavingAccount extends BankAccount
{
	public SavingAccount(String accountNumber, double balance)
	{
		super(accountNumber,balance);
		
	}
	
	public void withdraw(double amount)
	{
		if(getBalance()-amount<100)
		{
			System.out.println("You required to maintain the min balance amount that is 100INR");
		}
		else
		{
			withdraw(amount);
		}
	}
}
