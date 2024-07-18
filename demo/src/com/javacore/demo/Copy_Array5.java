//by using arraycopy method
package com.javacore.demo;

public class Copy_Array5 {

	public static void main(String[] args) {
	
		int a [] = {12,21,0,5,7};
		int [] b= new int[a.length];
		
		
		System.arraycopy(a, 0, b, 0,2);
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
//		a[2] =56;
//		System.out.println(b[2]);
	}

}
