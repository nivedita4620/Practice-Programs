package com.javaprograms;

import java.util.Scanner;

public class Condition_elseif {

	
	public static void main(String[] args) {
		int marks;
		System.out.println("Enter Marks : ");
		Scanner sc = new Scanner(System.in);
		marks=sc.nextInt();
		
		if(marks>=60 && marks<100)
		{
			System.out.println("First Class");
		}
		else if(marks>=45 && marks<60)
		{
			System.out.println("Secound Class");
		}
		else if(marks>=33 && marks<45)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("Fail..");
		}
	}

}
