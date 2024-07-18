package com.stringdemo;
/*String:
 * It is a non-primitive data type.
 * String is a Class.
 * String is Immutable.
 * String Storage: Heap and String Constant Pool or String Literal Pool
 * To create String there are 3 classes:
 * 1. String
 * 2. StringBuffer
 * 3. StringBuilder
 * We can declare string by using 2 ways: 
 * 	1. by using literal way
 * 	2. by using new keyword
 * */
public class StringDemo
{
	public static void main(String[] args) 
	{
		// concate two strings
		String name1 = "nivedita";
		String name2 = "sonkawade";
		String name3 = name1.concat(name2); //or String name6 = name4+name5;
		System.out.println(name3);
		
		// by using Literal way 
		String s = "Hell";   // StringPool Area
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2)); // true
		
		
		// by using new keyword
		String s3 = new String("Hello");
		String s4 = new String("JAva");
		System.out.println(s.equals(s1)); // false
		System.out.println(s2.equals(s3));
		
		
		// using == operator
		String ss1 ="Java";
		String ss2 ="Java";
		String ss3 = new String("Java");
		String ss4 = new String("Java");
		System.out.println(ss1==ss2);// true
		System.out.println(ss1==ss3);// false
		System.out.println(ss3==ss4);// false
		
		// By using compareTo() method
		//String Class Method
		//chaerAt()
		String name="Nivedita";
		System.out.println(name.charAt(2));//v
		
		//equalsIgnoreCase()
		String n1= "Nivedita";
		System.out.println(n1.equalsIgnoreCase("nivedita"));//true
		
		// length()
		String n2 = " Java Programming";
		System.out.println(n2.length());
		
		//replace()
		String n3= " Nivedita Sonkawade";
		System.out.println(n3.replace('N', 'n'));
		
		//substring()
		String n4= "123456789";
		System.out.println(n4.substring(3));
		System.out.println(n4.substring(3, 7));
		
		//toLower Case
		String n5= "NIVEDITA";
		System.out.println(n5.toLowerCase());
		
		//toUpper Case
		String n6= "nivedita";
		System.out.println(n6.toUpperCase());
		
		//
		
	}

}
