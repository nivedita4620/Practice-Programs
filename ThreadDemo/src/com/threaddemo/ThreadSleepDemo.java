package com.threaddemo;

class Sleepdemo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5;i++)
		{
			System.out.println(i);
			try 
			{
				sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class ThreadSleepDemo
{

	public static void main(String[] args)
	{
		Sleepdemo sd = new Sleepdemo();
		sd.start();
		
	}

}
