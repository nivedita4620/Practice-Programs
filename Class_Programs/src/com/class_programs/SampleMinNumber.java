package com.class_programs;

public class SampleMinNumber {
	
	public void minFunction(int n1 , int n2)
	{
		int min;
		if(n1>n2)
		{
			System.out.println("The minimum value is :"+n2);
		}
		else
		{
			System.out.println("The Minimum value is:" +n2);
		}
	}

	public static void main(String[] args) {
		
		int a= 11;
		int b= 6;
		int c;
		
		SampleMinNumber smn = new SampleMinNumber();
		smn.minFunction(a, b);
		
		
	}

}
