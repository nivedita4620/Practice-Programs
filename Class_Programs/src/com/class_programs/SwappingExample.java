package com.class_programs;

import java.util.Scanner;

public class SwappingExample {
	
	public  void swapFunction(int a, int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Enter a value:"+a);
		System.out.println("Enter b value:"+b);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a= sc.nextInt();
		System.out.println("Enter a value:");
		int b= sc.nextInt();
		System.out.println("Enter b value:");
		SwappingExample sx = new SwappingExample();
		// calling the swap method
		sx.swapFunction(a,b);
		
		
	}

}
