//Write a Java program to check whether a given string ends with another string.
package com.string_lab;

import java.util.Scanner;
// create class 
public class EndsWithAnotherString
{
    // main method
    public static void main(String[] args)
    {
        // Scanner class is predefined class
        // sc is object of Scanner class
        Scanner scanner = new Scanner(System.in);

    // Input the string to check
        System.out.print("Enter the string: ");
        String sc1 = scanner.nextLine();

        // Input the string to check
        System.out.print("Enter the string to check if it ends with: ");
        String sc2 = scanner.nextLine();

        // Check if the mainString ends with the endString
        boolean endsWith = checkEndsWith(sc1, sc2);

        // Display the result
        if (endsWith) {
            System.out.println("The string ends with " + sc2);
        } else {
            System.out.println("The string does not end with " + sc2);
        }

       
    }

    // Method to check if a string ends with another string
    public static boolean checkEndsWith(String mainString, String endString)
    {
        // Using the endsWith method of the String class to perform the check
        return mainString.endsWith(endString);
    }
}
/*Dry Run

Enter the string: Nivedita
Enter the string to check if it ends with: a
The string ends with a


Enter the string: Nivedita
Enter the string to check if it ends with: l
The string does not end with l
*/