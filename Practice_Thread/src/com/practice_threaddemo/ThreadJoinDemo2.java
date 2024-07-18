package com.practice_threaddemo;

public class ThreadJoinDemo2 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		try
		{
			
			mainthread.join();
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
	public static void main(String[] args) 
	{
		mainthread=Thread.currentThread();
		ThreadJoinDemo2 tjd = new ThreadJoinDemo2();
		tjd.start();
		
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
