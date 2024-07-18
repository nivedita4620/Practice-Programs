package com.practice_threaddemo;

public class InterruptDemo1 extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Thread Interrupted : " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted : "+e);
		}
	}
	public static void main(String[] args)
	{
		InterruptDemo1 id1 = new InterruptDemo1();
		id1.start();
		id1.interrupt();
	}

}
