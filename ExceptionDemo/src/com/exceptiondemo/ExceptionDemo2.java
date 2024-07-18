package com.exceptiondemo;
//NullPointerException
public class ExceptionDemo2 
{

	public static void main(String[] args)
	{
		String str =  null;
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("error");
		}
		
	}

}