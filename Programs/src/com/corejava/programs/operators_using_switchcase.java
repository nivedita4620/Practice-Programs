package com.corejava.programs;
import java.util.Scanner;
public class operators_using_switchcase {

	public static void main(String[] args) {
	
		int a=10, b=20, c, choice;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter Your Choice:");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Mulitiplication");
			System.out.println("3. Division");
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			c=a+b;
			System.out.println("Addition is:"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substraction is:"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Mulitiplication is:"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division is:"+c);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		

	}

}
