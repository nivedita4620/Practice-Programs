package com.loopprograms;

import java.util.Scanner;

public class Do_while_loop {

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any Number : ");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		do
		{
			System.out.println(num+" ");
			++num;
		}
		while(num<=10);
	}
}
