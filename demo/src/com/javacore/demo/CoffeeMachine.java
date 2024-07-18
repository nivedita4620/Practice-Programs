package com.javacore.demo;
import  java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Your Coffee:");
		System.out.println("1. Expresso");
		System.out.println("2. Dolgano");
		System.out.println("3. Americano");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("You choose Expresso, and the price is 150");
			break;
		case 2:
			System.out.println("You choose Dolgano, and the price is 250");
			break;
		case 3:
			System.out.println("You choose Americano, and the price is 250");
			
			
		}
		
	}

}
