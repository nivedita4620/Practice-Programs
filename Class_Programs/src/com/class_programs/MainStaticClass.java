package com.class_programs;

class StaticBlockDemo
{
	static int staticVariable;
	
	static 
	{
		System.out.println("Static Component SIB (Static Initialization Block)");
		staticVariable =10;
	}
	static void staticMethod()
	{
		System.out.println("From Static Method");
		System.out.println(staticVariable);
	}

}
public class MainStaticClass
{
	static
	{
		System.out.println("Main class SIB");
	}

	public static void main(String[] args) 
	{
		StaticBlockDemo.staticVariable=20;
		StaticBlockDemo.staticMethod();
	}

}
