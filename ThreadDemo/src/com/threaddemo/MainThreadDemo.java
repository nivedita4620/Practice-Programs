package com.threaddemo;

public class MainThreadDemo
{

	public static void main(String[] args)
	{
		Thread t =Thread.currentThread();
		t.setName("Im Main Mehod!");
		System.out.println(t.getName());
		Thread.currentThread().setName("Main method");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println((Thread.MIN_PRIORITY));
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
