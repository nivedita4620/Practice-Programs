package com.innerdemo;

class Outer
{
	int x=10;
	class Inner // nested class/ inner class
	{
		int y= 20;
		public int innerMethod()
		{
			return x;
		}
	}
}
public class AccessOuterMain
{

	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		System.out.println(in.innerMethod());
		
	}

}
