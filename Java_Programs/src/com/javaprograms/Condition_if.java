package com.javaprograms;

import java.util.Scanner;

public class Condition_if {

	public static void main(String[] args) {
		
		int pwd;
		System.out.println("Enter Password:");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd==111)
		{
			System.out.println("Name : Nivedita");
			System.out.println("Age :21");
			System.out.println("Contact: 808031895");
		}
		else
		{
			System.out.println("Wrong Password...15");
		}
	}

}
