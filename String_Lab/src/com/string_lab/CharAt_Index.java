//Write a Java program to get the character at the given index within the string.
package com.string_lab;

import java.util.Scanner;
// cretae class its name is CharAt_Index
public class CharAt_Index
{

	public static void main(String[] args)
	{
		
//		String str = "Nivedita Sonkawade";
//		System.out.println("String is:"+str);
//		System.out.println("The character at 2 nd position is: "+str.charAt(2));
//		System.out.println("The character at 6 th position is: "+str.charAt(6));
//		System.out.println("The character at 13 th position is: "+str.charAt(13));
		
		//OR
		// Taking input from user
		// Scanner is predefined class
		//sc is object of Scanner class
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter the first string
		System.out.println("Enter first string string:");
		 // Read the input string from the user
		String str1 = sc.nextLine();
		
		// Display the character at the 6th position (index 5) of the input string
        // Note: The index is zero-based, so index 5 corresponds to the 6th character
		System.out.println("The character at 2 nd position is: "+str1.charAt(5));
	}

}
/*Dry Run
Enter first string string:
Nivedita
The character at 2 nd position is: i*/