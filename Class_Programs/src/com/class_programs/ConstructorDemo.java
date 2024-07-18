package com.class_programs;

public class ConstructorDemo 
{
	public  ConstructorDemo()  // special type of method whose name of the 
	{
		System.out.println("Constructor is starting..");
	}
	public void show()
	{
		System.out.println("Method");
	}

	public static void main(String[] args)
	{
		ConstructorDemo cd1 = new ConstructorDemo();
		//cd1.ConstructorDemo();
		cd1.show();
	}

}
/* output is 
 * Constructor is starting..
 * Method*/
 