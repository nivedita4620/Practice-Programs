package com.practice_threaddemo;

public class SleepThreadDemo extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		SleepThreadDemo std = new SleepThreadDemo();
		std.start();
	}

}
