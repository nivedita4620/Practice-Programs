// program_demo
package com.javacore.demo;
import java.util.Scanner;

public class program_demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet:");
        String input = sc.next().toLowerCase();
        
        boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean Vowels = input.equals("a") || input.equals("e") || input.equals("o") || input.equals("i") || input.equals("u");
        
        if (input.length() > 1) {
            System.out.println("Error: Not a single character");
        } else if (!(upperCase || lowerCase)) {
            System.out.println("Error: Not a letter");
        } else if (Vowels) {
            System.out.println("Input is a vowel");
        } else {
            System.out.println("Input is a consonant");
        }

        sc.close(); // close the Scanner
		
	}

}
