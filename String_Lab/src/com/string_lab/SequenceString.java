//Write a Java program to test if a given string contains the specified sequence of char values.
// Importing the necessary package for the class
package com.string_lab;
// Defining the class named SequenceString
public class SequenceString 
{
// The main method, where the execution of the program begins
	public static void main(String[] args)
	{
	       // Declaring and initializing the input string
		String str1 = "Java is a object oriented programmaming language";
		 // Declaring and initializing the sequence of characters to search for in the input string
		String sequence = "language";
		  // Checking if the input string contains the specified sequence
		boolean containsSequence = str1 .contains(sequence);
		// Checking if the sequence is found in the string
		if (containsSequence)
		{
		      // If the sequence is found, printing a message indicating its presence
			System.out.println("The squence '"+sequence +"' is found in the string");
		}
		else
		{
		     // If the sequence is not found, printing a message indicating its absence
			System.out.println("The squence '"+sequence +"' is not found in the string");
		}
	}

}
/*Dry Run
The squence 'language' is found in the string*/
