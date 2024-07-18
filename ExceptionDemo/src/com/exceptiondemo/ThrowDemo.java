package com.exceptiondemo;
/*ArithmeticException ae = new ArithmeticException()	// object create
 * ArithmeticException ae;		//reference variable
 * new ArithmeticException()	//instance of class
 * */
public class ThrowDemo
{
	void validate(int age)
	{
		
		if(age<18)
		throw new ArithmeticException ("age is not valid"); //throw instance of class(ArithmeticException)
		else
			System.out.println("You are eligible for voting");
	}

	public static void main(String[] args)
	{
		ThrowDemo td = new ThrowDemo();
		try
		{
			td.validate(13);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Welcome for Voting");
		}
		//td.validate(8);
	}

}
