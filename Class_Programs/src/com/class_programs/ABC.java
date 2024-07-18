package com.class_programs;

public class ABC 
{
	int i;
	
	
	public static void main(String[] args) 
	{
		ABC a = new ABC();
		System.out.println(a);
		//System.out.println(a.i);
	}


	@Override
	public String toString() {
		return "ABC [i=" + i + "]";
	}

}
