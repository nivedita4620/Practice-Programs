package com.corejava.programs;
import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int n1 =  sc.nextInt();
		
		 if (n1 > 0) 
		 {
	            System.out.println("The number is positive.");
	        } 
		 else if (n1 < 0)
		 {
	            System.out.println("The number is negative.");
	        }
		 else
		 {
	            System.out.println("The number is zero.");
	      }
		

	}

}
