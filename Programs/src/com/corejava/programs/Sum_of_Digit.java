package com.corejava.programs;

import java.util.Scanner;

public class Sum_of_Digit 
{
	int n1,n2,result;
	void getData()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n1:");
		System.out.println("Enter n2:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
	}
	
	void cal()
	{
		result = n1+n2;
		System.out.println("Addition is:"+result);
	}


	public static void main(String[] args)
	{
		Sum_of_Digit sm = new Sum_of_Digit();
		sm.getData();
		sm.cal();
	}

}
