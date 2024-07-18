package com.pacakage1;

public class BankMain
{

	public static void main(String[] args) 
	{
		// for bankAccount
		System.out.println("Initial balance for the account A/C-2575 is 500");
		BankAccount A2575=new BankAccount("A/C-2575",500);
		
		// deposite the amount in the bank
		System.out.println("Deposite 1000 rs into account A/C-2575");
		A2575.deposite(1000);
		System.out.println("New Balancee after deposting 1000 rs is" +A2575.getBalance());
			
		System.out.println("Withdraw the amount 600 from the account A2575");
		A2575.withdraw(600);
		System.out.println("New balance after withdrawing 600 rs is" +A2575.getBalance());
		
		
		
		// for saving Account
		System.out.println("Initial balance for the Saving  account A/C-257512 is 450");
		BankAccount A257512=new BankAccount("A/C-257512",450);
		
		// deposite the amount in the bank
		System.out.println("Deposite 2000 rs into account A/C-257512");
		A257512.deposite(2000);
		System.out.println("New Balancee after deposting 1000 rs is" +A257512.getBalance());
			
		System.out.println("Withdraw the amount 300 from the account A257512");
		A257512.withdraw(300);
		System.out.println("New balance after withdrawing 300 rs is" +A257512.getBalance());
		
	}
	

}
