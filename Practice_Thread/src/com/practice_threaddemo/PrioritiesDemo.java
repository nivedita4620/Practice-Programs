package com.practice_threaddemo;

public class PrioritiesDemo extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
		System.out.println("Child Priortity : " +Thread.currentThread().getPriority());
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Thread old Priority : "+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);//7
		//Thread.currentThread().setPriority(MAX_PRIORITY);//10
		//Thread.currentThread().setPriority(MIN_PRIORITY);//1
		Thread.currentThread().setPriority(NORM_PRIORITY);//5
		System.out.println("Main Thread new Priority : " +Thread.currentThread().getPriority());
		PrioritiesDemo pd =new PrioritiesDemo();
		pd.start();
	}

}
