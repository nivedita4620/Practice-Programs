package com.threaddemo;
//1 way of creating the thread by extending thread class.
class ThreadOne extends Thread //internally implements runnable
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread One : " +i);
		}
	}
}
class ThreadTwo extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thread Two : " +i);
		}
	}
}
public class ThreadInJava 
{

	public static void main(String[] args)
	{
		ThreadOne t1 = new ThreadOne();// new state
		ThreadTwo t2 = new ThreadTwo();
		// or t1.run();
		t1.start();//runnable ==> in thread we cn call methods using start(). start()can call internally run()
		//t2.run();==>output will be same
		t2.start();
	}

}
