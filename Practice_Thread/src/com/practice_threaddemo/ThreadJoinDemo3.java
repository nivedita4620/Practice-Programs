package com.practice_threaddemo;

class Medical extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Medical Starts");
			Thread.sleep(2000);
			System.out.println("Medical Completed");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
class TestDriver extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Test Drive Starts");
			Thread.sleep(2000);
			System.out.println("Test Drive Completed");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
class OfficerSign extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Officers take the file");
			Thread.sleep(2000);
			System.out.println("Officers work completed");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
public class ThreadJoinDemo3 
{

	public static void main(String[] args) throws InterruptedException
	{
		Medical med= new Medical();
		med.start();
		med.join();
		
		TestDriver td = new TestDriver();
		td.start();
		td.join();
		
		OfficerSign os = new OfficerSign();
		os.start();
	}

}
