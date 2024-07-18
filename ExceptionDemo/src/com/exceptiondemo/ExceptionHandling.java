package com.exceptiondemo;
// Marker Interface
/*
 * 
 * A marker is an interface that does not have anymethods or constants inside it.
 * it provides runtime type information about objects,
 * so the compiler and jvm have additional information about the object.
 * class extends class
 * class implements interface
 * interface extends interface*/

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		System.out.println("Statement is executed");
		try
		{
			Integer i = new Integer("abc"); // NumberFormatError
		}
		catch(NumberFormatException ns)
		{
			System.out.println("String value");
		}
		//int a="abc";
		System.out.println("Statement is not executed");
	}
	

}
