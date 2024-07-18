package com.javaprograms;

import java.util.Scanner;

/* Keyword:
 * These are the reserved word whose meaning is the already defined in the java complier.
 * Keyword are case sensitive
 * In java 50 keywords + 3 literals
 * null, true, false these are literals in java 
 * 
 * 
 * 
 * Identifier:
 * it refers to the name of variables, methods, classes etc.
 * 
 * Input and Output:
 * Input-> Scanner Class (present in java.util.Scanner) 
 * Scanner class methods:
 * 1. nextInt() -> for integer value
 * 2. nextLine() -> for String value
 * 3. nextDouble() -> for double value
 * 
 * Output:
 * Output-> System Class (present in java.lang.System) // by default package
 * */
public class Keyword_Class {

	public static void main(String[] args) {
		
		// add two umbers
		
		int a , b,c;
		System.out.println("Enter two number : ");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Addition is: "+c);

	}

}
