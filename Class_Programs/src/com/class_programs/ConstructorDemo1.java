package com.class_programs;

public class ConstructorDemo1 
{

	public  ConstructorDemo1()  // special type of method whose name of the 
	{
		System.out.println("Constructor is starting..");
	}
	static public void show()
	{
		System.out.println("Method");
	}

	public static void main(String[] args)
	{
		ConstructorDemo1 cd1 ;
		ConstructorDemo1.show();
	}


}


/* output will be only method
 * 
 * in this we can't use new keyword
 *  becuse of we use static keyword 
 * */
 