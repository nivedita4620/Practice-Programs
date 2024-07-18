package com.practice_threaddemo;

public class DeamonThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Daemon Thread");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		DeamonThreadDemo dtd = new DeamonThreadDemo();
		dtd.setDaemon(true);
		dtd.start();
	}

}
