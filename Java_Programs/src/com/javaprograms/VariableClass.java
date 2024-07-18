package com.javaprograms;

/*Variable :  
 * Variable is the name of the memory location where we stored different types of value
 * There are 4 types:
 * 1. Local -> declare in method or body
 * 2. Instance -> declare in class , outside of method or body
 * 3. static 
 * 4. final
 * */
public class VariableClass 
{
	int a=10;  //instance variable
	static double b =20.10; // static variable where 
	
	public static void main(String[] args) 
	{
		boolean c = true; // local variable
		
		VariableClass vc = new VariableClass();
		
		// System.out.println(vc.a); // for instance varibale object of class is required
		System.out.println((vc.a+" "+b+" "+c));
	}

}
