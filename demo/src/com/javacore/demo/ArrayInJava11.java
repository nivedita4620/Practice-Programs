package com.javacore.demo;
 // method returning an array of derived type
class N
{
	int i;
	@Override
	public String toString()
	{
		return "A [i=" + i + "]";
	}

	
	
}

public class ArrayInJava11
{

	static N[] methodOne()
	{
		N [] a= new N[8];
		a[2]= new N(); // created object
		a[5]= new N();
		a[2].i=10;
		a[5].i=20;
		return a;
	}
	public static void main(String[] args)
	{
		N[] a=methodOne();
		System.out.println(a[2]);
		System.out.println(a[5]);
	}

}
