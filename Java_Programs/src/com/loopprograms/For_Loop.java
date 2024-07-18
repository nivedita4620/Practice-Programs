package com.loopprograms;

import java.util.Scanner;

public class For_Loop
{

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any Number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
	}

}
