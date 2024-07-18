package com.corejava.programs;

public class Avg_Sum_Array {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
	        int n1 = 0;  


	        for (int i = 0; i < arr.length; i++) 
	        {  
	           n1 = n1 + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + n1);  
	        
	        int avg;
	        avg = n1/arr.length;
	        System.out.println("Average of Array:" +avg);;

	}

}
