package com.threaddemo;

class ThreadFirst implements Runnable
{
	public void run()
	{
		for(int i =0; i<=5;i++)
		{
			System.out.println("Thread 1 : "+i);
		}
	}
}

class ThreadSecound implements Runnable
{
	@Override
	public void run()
	{
		for(int i =0; i<=5;i++)
		{
			System.out.println("Thread 2 : "+i);
		}
	}
	
}
public class threadInJavaRunnable
{

	public static void main(String[] args) 
	{
		ThreadFirst tf1 = new ThreadFirst();
		Thread t = new Thread(tf1);
		t.start();
		System.out.println("My name is main Thread");
		
		ThreadSecound ts1 =new ThreadSecound();
		Thread t1 = new Thread(ts1);
		t1.start();
		
	}

}
