package com.exceptiondemo;
//ArithmeticException
public class ExceptionDemo4 {

	public static void main(String[] args) {
	int  a = 30;
	int b = 0;
	try
	{
		int c= a/b;
		System.out.println("Result:"+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("0 is not possible");
	}
	}

}
