package com.threaddemo;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Nivedita:This is my Task.");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("This is my Task.");
	}
}
public class ThreadNameDemo 
{

	public static void main(String[] args) 
	{
		MyThread th = new MyThread ();
		th.start();
		th.setName("Nivedita");
		//System.out.println(th.getName());
		String name = th.getName();
		System.out.println(name);
		System.out.println(th.getPriority());
		System.out.println(th.getId());
		
		MyThread2 th2 = new MyThread2();
		th2.setName("abc");
		System.out.println(th2.getName());
		System.out.println(th2.getId());
		System.out.println(th.getPriority());
		th2.start();
		/*priority=> 
		 * min: 1
		 * max: 10
		 * norm: 5*/
	}

}
