package com.loopprograms;

import java.util.Scanner;

public class WhileLoop 
{

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any Number : ");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		while(num>=0)
		{
			if(num%2==0)
			{
				System.out.println("Even Number..");
				break;
			}
			else
			{
				System.out.println("Odd Number..");
			}
		}
	}

}
