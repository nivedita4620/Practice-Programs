package com.interfacedemo;


interface Account
{
	void deposite(double amount);
	void withdraw(double amount);
}

class SavingAccount
{
	private double balance;
	private double interestRate;
	public SavingAccount(double balance, double interestRate)
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

class CurrentAccount
{
	private double balance;
	private double overdraftLimit;
	public CurrentAccount(double balance, double overdraftLimit) {
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
public class BankMain
{

	public static void main(String[] args) 
	{
		SavingAccount svg_acc = new SavingAccount(1000,100);
		svg_acc.deposite(500);
		System.out.println("Your Saving Account Balance is :"+svg_acc.getBalance());
		svg_acc.withdraw(200);
		System.out.println("");
		
		CurrentAccount cur_acc = new CurrentAccount (2000,500);
		cur_acc.deposite(600);
		System.out.println("Your Current Account Balance is :"+cur_acc.getBalance());
		
	}

}
