package com.corejava.programs;

public class Sum_Array {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
	        int n1 = 0;  


	        for (int i = 0; i < arr.length; i++) 
	        {  
	           n1 = n1 + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + n1);  
	}

}
