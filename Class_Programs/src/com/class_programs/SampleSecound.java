package com.class_programs;

class SampleDemo
{
	int x=5;
	public void SampleDemoMethod()
	{
		System.out.println("Value of x for SampleDemoMethod:" +x);
	}
}

public class SampleSecound //class declaration
{
	int x = 10;  // varaiable declration and initialization
	
	public void method1() // method defination
	{
		System.out.println("Value of x for method1:" +x); //lohic inmethod
	}
	
	public void method2() // method defination
	{
		System.out.println("Value of x for method2:" +x); //lohic inmethod
	}

	public static void main(String[] args) { // starting point for the program
		SampleSecound ss1 = new SampleSecound(); // object get created
		ss1.method1();
		ss1.method2();// calling method
		
		SampleDemo sd = new SampleDemo();
		sd.SampleDemoMethod();
	}

}
