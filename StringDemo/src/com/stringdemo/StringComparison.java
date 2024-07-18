package com.stringdemo;

/*
 * When To Use “==”, equals() And hashCode() On Strings
 * ==” operator, equals() method and hashcode() methods are used to check the equality of any
 *  type of objects in Java.
 *  
 *  “==” operator compares the two objects on their physical address.
 *   That means if two references are pointing to same object in the memory,
 *   then comparing those two references using “==” operator will return true.
 * This type of comparison is called “Shallow Comparison”
 * 
 * equals() method, if not overrided, will perform same comparison as “==” operator 
 * does i.e comparing the objects on their physical address. So, it is always recommended 
 * that you should override equals() method in your class so that it provides field by 
 * field comparison of two objects. 
 *  This type of comparison is called “Deep Comparison”.
 *  
 *  hashCode() method returns hash code value of an object in the Integer form.
 *   It is recommended that whenever you override equals() method, you should also override
 *    hashCode() method so that two equal objects according to equals() method must return same 
 *    hash code values. This is the general contract between equals() and hashCode() methods
 *     that must be maintained all the time.
 *     
 * String s1 = "JAVA";
 
String s2 = "JAVA";

s1 == s2 —> will return true as both are pointing to same object in the constant pool.
s1.equals(s2) —> will also return true as both are referring to same object.
s1.hashCode() == s2.hashCode() —> It also returns true.


String s1 = new String("JAVA");
 
String s2 = new String("JAVA");

s1 == s2 ->   will return false because s1 and s2 are referring to two different objects in the memory.
s1.equals(s2) -will return true as both the objects have same content.
s1.hashCode() == s2.hashCode() -> It will also return true because two equals string objects according to 
equals() method will have same hash code values.

String s1 = "JAVA";
 
String s2 = new String("JAVA");

s1 == s2 —> will return false because s1 and s2 are referring to two different objects in the memory.
s1.equals(s2) —> will return true as both the objects have same content.
s1.hashCode() == s2.hashCode() —> It will also return true.



String s1 = "0-42L";
 
String s2 = "0-43-";

 * 
 */
public class StringComparison {

	public static void main(String[] args) {
		String s1 = "0-42L";
		 
		String s2 = "0-43-";
		
		System.out.println(s1 == s2);//will return false as s1 and s2 are referring to two different objects in the memory.

		System.out.println(s1.equals(s2));//false
		
		System.out.println(s1.hashCode() == s2.hashCode());//true
		
	}
	
	/*Conclusion :
When you want to check the equality of two string objects on their physical 
existence in the memory, then use “==” operator. 
If you want to check the equality of two string objects depending upon their contents, 
then use equals() method. It is recommended not to use hashCode() method to check the equality
 of two string objects. You may get unexpected result.


	 * 
	 * 
	 */

}

