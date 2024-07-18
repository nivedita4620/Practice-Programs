package com.corejava.programs;
import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        int sum = 0;
	        int avg = 0;
	        System.out.println("Input the 5 numbers: ");
	        for(int i=1; i<=5; i++){
	            int num = input.nextInt();
	            sum +=  num;
	        }
	        System.out.println("The sum of the given number is " + sum);
	        avg = sum/5;
	        System.out.println("The average of the given number is " + avg);

	}

}
