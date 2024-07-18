package com.corejava.programs;

public class add_binary
{
	static String binary(String x, String y)
	{
		int n1,n2,sum;
		n1=Integer.parseInt(x, 2);
		n2=Integer.parseInt(y,2);
		sum = n1+n2;
		String res = Integer.toBinaryString(sum);
		return res;
	}
	public static void main(String[] args) 
	{
		String x = "011111", y="1010111";
		System.out.println(binary(x,y));
	}

}
