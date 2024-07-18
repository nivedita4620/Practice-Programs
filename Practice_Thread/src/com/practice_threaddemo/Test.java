package com.practice_threaddemo;

public class Test extends Thread
{
	public void run()
	{
		
		//Thread.currentThread().setName("Harsh");
		System.out.println("Thread Task : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello : " +Thread.currentThread().getName());
		Test t1 = new Test();
		t1.start();
		
		Test t2 = new Test();
		t2.start();
		
		Test t3 = new Test();
		t3.setName("Nivedita");
		t3.start();
		
		Test t4 = new Test();
		t4.setName("Harsh");
		t4.start();
		
		//isAlive()
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t1.isAlive());
	}

}
