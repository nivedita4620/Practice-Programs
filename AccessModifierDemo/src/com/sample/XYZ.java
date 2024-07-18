package com.sample;

import com.demo.ABC;
public class XYZ 
{

	public static void main(String[] args)
	{
		ABC ab = new ABC();
		System.out.println(ab.a);
	}

}

class OPP extends ABC
{
	ABC a1 =new ABC();
	void display()
	{
		System.out.println(a1.a);
	}
}
