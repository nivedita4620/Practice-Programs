package com.javacore.demo;
// passing array of derived type as a parameter to the method
class A
{
	int i;
}
public class ArrayInJava9 
{
	static void methodOne(A[] a)
	{
		a[2].i= 25; // changing the value of element at index 2
		a[5].i=45; // changing the value of element at index 5
		
	}

	public static void main(String[] args) 
	{
		 A [] a = new A[8];
		 a[2] = new A(); // creataing A type object and assigning it to element at index 2
		 a[5] = new A(); // creataing A type object and assigning it to element at index 5
		 
		 a[2].i=10;
		 a[5].i=20;
		 
		 methodOne(a);
		 
		 System.out.println(a[2].i);
		 System.out.println(a[5].i);
	}
	
	
}
