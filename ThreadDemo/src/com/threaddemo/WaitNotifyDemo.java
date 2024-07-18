package com.threaddemo;

class Customer extends Thread
{
	int amount =10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw... ");
		if(this.amount<amount)
		{
			System.out.println("Less Amount wait for deposite");
			try 
			{
				wait();// present in object class
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().currentThread().getName()+" "+this.amount);
		System.out.println("Withdra Completed");
		
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposite... ");
		this.amount=this.amount+amount;
		System.out.println("Deposite Completed");
		System.out.println(Thread.currentThread().currentThread().getName()+" "+this.amount);
		notifyAll();
	}
}
public class WaitNotifyDemo 
{
	
	public static void main(String[] args)
	{
		final Customer c1 = new Customer();
		
		new Thread()
		{
			// anonomus object of the class
			public void run()
			{
				c1.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			// anonomus object of the class
			public void run()
			{
				c1.deposit(10000);
			}
		}.start();
	}

}
