package com.threaddemo;

public class Account extends Thread
{
	static int balance = 1000;
	
	public void run()
	{
		synchronized (Account.class)
		{
			if(balance>800)
		{
			System.out.println(Thread.currentThread().getName() + " Your balance is " + balance + " " + "rs you can withdraw the amount");
			
			try 
			{
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			balance=200;
			System.out.println(Thread.currentThread().getName() + " After withdrawal your balnce is " + "balance is " +balance );
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " Your balance is " + balance + "so you cant withdraw the amount");
		}
		}
		
	}
	
}
