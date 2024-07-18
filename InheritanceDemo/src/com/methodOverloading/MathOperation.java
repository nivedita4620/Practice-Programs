package com.methodOverloading;

public class MathOperation
{
	public void add(int a, int b)
	{
		System.out.println(a +b);
	}
	
	public void add(int a, int b,int c)
	{
		System.out.println(a +b +c);
	}
	
	public void add(double a, double b)
	{
		System.out.println(a +b);
	}
	public static void main(String[] args)
	{
		MathOperation obj1 = new MathOperation();
		obj1.add(10, 20);
		
		obj1.add(10, 20, 30);
		
		obj1.add(10.5, 20.5);
	}

}
