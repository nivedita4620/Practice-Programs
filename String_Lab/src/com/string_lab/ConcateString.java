//Write a Java program to concatenate a given string to the end of another string.
package com.string_lab;
// impot package Scanner
import java.util.Scanner;
// create class ConcateString
public class ConcateString 
{

	public static void main(String[] args) 
	{
//		String str1 = "Nivedita ";
//		String str2 =str1.concat("Sonkawade");
//		System.out.println("Concate String is :"+str2);
		
		 // Creating a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the first string
		System.out.println("Enter first string string:");
		// Read the first input string from the user
		String str1 = sc.nextLine();
		
		// Prompt the user to enter the second string
		System.out.println("Enter secound string string:");
		// Read the second input string from the user
		String str2 = sc.nextLine();
		
		 // Concatenate the two input strings using the + operator
		String str3 = str1+str2;
		
		 // Display the concatenated string to the user
		System.out.println("Concate String is: "+str3);
	}

}
/*Dry Run
Enter first string string:
Nivedita
Enter secound string string:
Sonkawade
Concate String is: NiveditaSonkawade
*/