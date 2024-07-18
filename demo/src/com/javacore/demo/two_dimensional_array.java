// Two  Dimenstional Array

package com.javacore.demo;

public class two_dimensional_array {

	public static void main(String[] args) {
	
		/*Double [] [] matrix = { //instation and intilization of array
				{1.2,4.3,4.0},
				{4.1,1.1,2.5},
				{2.3}
				// matrix[0] [0] ==>1.2
				// matrix[1] [2] ==>2.5
				//matrix[2][0] ==>2.3
		};
		double [] [] matrix1; //declaration of two dimenstinal array
		
		double [] [] a= new double [3][2];//instatition
		
		int [] [] a1= new int [3][2];
		String [][] a2= new String [3][2];
		*/
		
		int [][] a= {
				{1,2,3},
				{4,5,6,9},
				{7}
		};
		System.out.println("Length of row 1 :" +a[0].length);
		System.out.println("Length of row 2 :" +a[1].length);
		System.out.println("Length of row 3:" +a[2].length);
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		
		System.out.println(a[2][0]);
		
	}

}
