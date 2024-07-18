package com.practice_threaddemo;

public class YieldDemo extends Thread
{
	public void run()
	{
		Thread.yield(); 
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}

	public static void main(String[] args) 
	{
		YieldDemo yd = new YieldDemo();
		yd.start();
		
		//Thread.yield(); => if u want main method to stop and provide to other threads for execution
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}

}
