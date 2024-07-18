package com.javacore.demo;

public class array_for_loop {

	public static void main(String[] args) {
		
		/*int [] [] a= {
				{1,-2,3},
				{-4,-5,6,9},
				{7},
		};
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		//use for each loop for the above matrix to display the matrix
		
		
			int[][] a = {
					{1, -2, 3},
					{-4, -5, 6, 9},
					{7},
			};
			
			for(int[] i : a)
			{
				for(int j : i)
				{
					System.out.println(j);
				}
			}
		
	}

}
