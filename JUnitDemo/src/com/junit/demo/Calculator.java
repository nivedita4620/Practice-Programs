package com.junit.demo;
//POJO -> Plain Old Java Object: It does not contains main method
public class Calculator 
{
	public int add(int a, int b)
	{
		int result = a+b;
		return result;
		
	}
	
	public int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		
		return max;
		
	}
	
}
