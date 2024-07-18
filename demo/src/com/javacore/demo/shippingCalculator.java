//calculator
package com.javacore.demo;
import java.util.Scanner;

public class shippingCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Your Shiping Method ");
		System.out.println("Morning Ship");
		System.out.println("Afternoon Ship");
		System.out.println("Night Ship");
		
		int shippingMethod =sc.nextInt();
		
		int baseCost=10;
		
	
		switch(shippingMethod)
		{
		case 1:
			System.out.println("You choose Morning Ship");

			break;
		case 2:
			System.out.println("You choose Afternoon Ship");
			baseCost=20;
			break;
		case 3:
			System.out.println("You choose Night Ship");
			baseCost=30;
			break;
		
		default:
			System.out.println("Invalid Ship");
			
		}
		

	}

}
