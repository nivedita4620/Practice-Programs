package com.practice_programs;

public class Prime_Numbers
{
	
	public static void main(String[] args)
	{
		// variable declaration
		int i=1;
		int n1=1;
		String pn=""; // pn is used to store the prime numbers found
		
		// outer loop
		for(i=1;i<=1000;i++)
		{
			int num=0; // num counts the number of factors of i
			
			// inner loop
			for(n1=i; n1>=1; n1--)  // loop to check if i is divisible by n1
				
			{
				if(i%n1==0) // if i is divisible by n1, increment num
				{
					num = num+1;
				}
			}
			if(num==2) // if num is 2, i is a prime number
			{
				pn=pn + i+ "\n";
			}
		}
		System.out.println("Prime Numbers are:");
		System.out.println(pn);
	}

}
