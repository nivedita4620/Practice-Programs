package com.exceptiondemo;

// unreacheable code in exception handling

// Employee emp= new Emloyee() // object // early binding
// Employee e;// reference // late binding
public class ExceptionDemo5
{

	public static void main(String[] args)
	{
		int res, a=10,b=0;
		try
		{
			res= a/b;
			System.out.println(res);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println(" no values in the variable");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" no values in the variable");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(" no values in the variable");
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			System.out.println(" no values in the variable");
		}
		finally
		{
			System.out.println("close all the connections..");
		}
		System.out.println("Excute code ");
	}

}
