// by using clone method
package com.javacore.demo;

public class Copying_Array2 {

	public static void main(String[] args) {
		
		
		int a [] = {12,21,0,5,7};
		// create a copy of array 'a'using clone method
		int [] b =a.clone();
		//print element b
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		a[2] =56;
		System.out.println(b[2]);
		
		b[4] =100;
		System.out.println(a[4]);
	}

}
