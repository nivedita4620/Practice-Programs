package com.pacakage1;
// this is pointing to current class data member current class constructor
public class ThisClass 
{
	int a;
	int b;
	int c;
	ThisClass()
	{
		this(10,20);
		System.out.println("Inside Default Constructor");
	}

	 ThisClass(int a, int b)
	 {
		 this(10,20,30);
		 this.a=a;
		 this.b=b;
		 System.out.println("Inside Parameter Constructor 1");
	 }
	 
	 ThisClass(int a, int b, int c)
	 {
		this.a=a;
		this.b=b;
		this.c=c;
		 System.out.println("Inside Parameter Constructor 2");
	 }

	public static void main(String[] args) 
	{
		ThisClass th1 = new ThisClass();

	}

}
