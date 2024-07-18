package com.class_programs;

class A
{
	int nonStaticVariable; //instance variable
	static int staticVariable;  //static variable
	
	static void staticMethod()  //static method
	{
		System.out.println("stastic variable:"+staticVariable);  
//		System.out.println(nonStaticVariable);  //non static methods can't be accessible into static method
	}
	
	void nonStaticMethod() //instance method
	{
		System.out.println(staticVariable);
		System.out.println(nonStaticVariable);
	}
	
	
	
//	void display()
//	{
//		System.out.println(nonStaticVariable);
//		System.out.println(staticVariable);
//	}
	
	
	
}

public class Static_Demo {
	
//	void display1()
//	{
//		System.out.println(a.nonStaticVariable);
//		System.out.println(A.staticVariable);
//	}

	public static void main(String[] args) {
		
		A.staticVariable = 10;
//		A.nonStaticVariable = 20;   // no object created so cannot access the variable
		
		A.staticMethod();
//		A.nonstaticMethod();  // no object created so cannot access the method
		
		
//		A a = new A():
//			System.out.println(a.nonStaticVariable);

		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.nonStaticVariable);
		System.out.println(a1.staticVariable);
		
		a1.nonStaticMethod();
		a1.staticMethod();
		
		System.out.println(a2.staticVariable);
		a1.staticVariable = 20;
		System.out.println(a2.staticVariable);
	}
}