package com.practice_threaddemo;

public class SleepDemo1 extends Thread
{
	public void run()
	{
		try 
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
		}
	public static void main(String[] args) 
	{
		SleepDemo1 sd1 = new SleepDemo1();
		sd1.start();
		
		SleepDemo1 sd2 = new SleepDemo1();
		sd2.start();
		/*
		 * output
		 * 1 : Thread-0
1 : Thread-1
2 : Thread-1
2 : Thread-0
3 : Thread-0
3 : Thread-1
4 : Thread-0
4 : Thread-1
5 : Thread-1
5 : Thread-0 */
		
//		SleepDemo1 sd3 = new SleepDemo1();
//		sd3.run();
//		
//		SleepDemo1 sd4 = new SleepDemo1();
//		sd4.run();
		/**output
		 * 
		 * 1 : main
2 : main
3 : main
4 : main
5 : main
1 : main
2 : main
3 : main
4 : main
5 : main
/
		 */
	}
}
