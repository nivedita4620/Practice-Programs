package com.corejava.programs;

		
public class demoo
{ 
	int a;
	int b;
	public demoo()
	{
		a=2;
		b=10;
		
	}
	public void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b)
	{
//		int a=10
//		int b=20;
//		int c =a+b;
		System.out.println(a+b);
	}

	public static void main(String [] args)
	{
		demoo d1 = new demoo();
		d1.add(2,4);
		d1.add();
	}
}
