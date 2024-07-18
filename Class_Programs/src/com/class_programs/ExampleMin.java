package com.class_programs;

public class ExampleMin {
	
	public boolean minFunction(int n, int m)
	{
		boolean min;
		if(n>m)
		{
			min = true;
		}
		else
		{
			min= false;
		}
		return min;
	}

	public static void main(String[] args) 
	{
		ExampleMin ex = new ExampleMin();
		//boolean result =ex.minFunction(3,9);
		System.out.println("Minimum value:"+ ex.minFunction(3, 9));
		//System.out.println("Minimum Value:"+result);

	}

}
