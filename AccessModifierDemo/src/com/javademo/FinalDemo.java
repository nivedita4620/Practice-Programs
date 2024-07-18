package com.javademo;

class A
{
	int i=0;
	
	void display()
	{
		System.out.println(i++);
	}
}

class B extends A
{
	void display()
	{
		System.out.println(i++);
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
