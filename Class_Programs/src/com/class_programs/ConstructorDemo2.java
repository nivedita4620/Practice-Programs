package com.class_programs;

class Demo
{
	public Demo(int a)
	{
		System.out.println("Value of a" +a*a);
	}
	
	public Demo (int a, int b)
	{
		System.out.println("Multiplication is:"+a*b);
	}
	
	public Demo (int a, float b)
	{
		System.out.println("Multiplication is:"+a*b);
	}
	
}
public class ConstructorDemo2 
{

	public static void main(String[] args) 
	{
		//Demo d1 = new Demo();
		Demo d1 = new Demo(3);
		Demo d2 = new Demo(3,4);
		Demo d3 = new Demo(3);

	}

}
