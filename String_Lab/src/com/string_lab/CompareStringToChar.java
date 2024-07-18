//Write a Java program to compare a given string to the specified character sequence.
// Importing the necessary packages
package com.string_lab;
// Defining a class named CompareStringToChar
public class CompareStringToChar {
// Main method
	public static void main(String[] args) {
    // Initializing two strings for comparison
		String str1 = "Dog is Animal.";
		String str2 = "Cat is Animal";
		// Initializing a CharSequence to compare against the strings
		CharSequence cs = "Dog is Animal.";
		// Comparing String 1 with the CharSequence and printing the result
		System.out.println("Compare String to CharSequence1: " +str1.equals(cs));
		// Comparing String 2 with the CharSequence and printing the result
		System.out.println("Compare String to CharSequence2: " +str2.equals(cs));
		
	}

}
/*Dry Run
Compare String to CharSequence1: true
Compare String to CharSequence2: false
*/
