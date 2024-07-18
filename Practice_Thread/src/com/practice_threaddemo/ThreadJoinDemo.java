package com.practice_threaddemo;

public class ThreadJoinDemo extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread:" +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		ThreadJoinDemo tjd = new ThreadJoinDemo();
		tjd.start();
		tjd.join();
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main Thread:" +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
