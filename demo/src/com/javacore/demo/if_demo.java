/*if demo*/
package com.javacore.demo;
import java.util.Scanner;

public class if_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		if(i < 15)
		{
			System.out.println("inside the if statement");
			System.out.println("10 is leas than 15");
		}
		
		/*int i=10;
		if(i < 15)
		{
			System.out.println("inside the if statement");
			System.out.println("10 is leas than 15");
		}
		else
		{
			System.out.println("inside the else statement");
			System.out.println("10 is not less than 15");
		}*/
		/* int i=10;
		
		if(i == 10)
		{
			//first if statement
			if(i < 15)
			{
					System.out.println("I is smaller than the 15");
			}
			if(i<12)
			{
				System.out.println(
	                    "i is smaller than 12 too");
			}
			else
			{
				System.out.println(
	                    "i is greater than 15 ");
			}
		}*/
		
		// in java scanner class is predefined
		// what purpose- to take input from user
		// it is working the input and output pipes(device)
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("i=10");
		int i1 = sc.nextInt();
		
		//int i=20;
		if(i1 == 10)
		{
		 System.out.println("i1 is 10");	
		}
		else if(i1 == 15)
		{
			System.out.println("i1 is 15");
		}
		else if(i1 == 20)
		{
			System.out.println("i1 is 20");
		}
		else
		{
			System.out.println("i1 is not present");
		}

	}





	}


