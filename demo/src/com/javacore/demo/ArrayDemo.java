package com.javacore.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int a []= {1,2,3,4};  
		
		int [] b=a;
		
		for(int i =0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		a[2]=0;
		System.out.println("-----------");
		System.out.println(b[2]);
		
		
	}

}
