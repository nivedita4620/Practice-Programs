package com.practice_threaddemo;

public class InterruptedDemo extends Thread
{
	public void run()
	{
		System.out.println(Thread.interrupted());// 1. true
		//System.out.println(Thread.interrupted());// 2. false ===>output : true to false convert then for loop execute and 1 2 3 4 5
		//System.out.println(Thread.currentThread().isInterrupted());// true-> trueoutput will be true and 1 then exception throw
		//System.out.println(Thread.currentThread().isInterrupted());//true -> true
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted: "+e);
		}
	}
	public static void main(String[] args) 
	{
		InterruptedDemo d1 = new InterruptedDemo();
		d1.start();
		d1.interrupt();
	}

}
