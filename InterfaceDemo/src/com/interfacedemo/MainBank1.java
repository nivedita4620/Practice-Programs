package com.interfacedemo;

public class MainBank1 
{

	public static void main(String[] args) 
	{
		SavingAccount1 svg_acc1 = new SavingAccount1(1000,100);
		svg_acc1.deposite(500);
		System.out.println("Your Saving Account Balance is :"+svg_acc1.getBalance());
		svg_acc1.withdraw(200);
		System.out.println("");
		
		CurrentAccount1 cur_acc1 = new CurrentAccount1 (2000,500);
		cur_acc1.deposite(600);
		System.out.println("Your Current Account Balance is :"+cur_acc1.getBalance());
		
	}

}
