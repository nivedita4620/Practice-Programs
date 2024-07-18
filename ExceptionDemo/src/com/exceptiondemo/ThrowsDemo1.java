package com.exceptiondemo;
import java.io.IOException;
// propogation of execution handling
public class ThrowsDemo1 
{
	void method1() throws IOException
	{
		throw new IOException("Problem");
	}
	void method2() throws IOException
	{
		method1();
	}
	void method3() throws IOException
	{
		method2();
	}
	public static void main(String[] args) 
	{
		ThrowsDemo1 td1 = new ThrowsDemo1();
		try {
			td1.method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Handle by main method");
		}
		System.out.println("execute remaining code");
	}

}
