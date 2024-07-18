package com.pacakage1;

public class ThisClass3 
{
	void display()
	{
		
		this.show();
		System.out.println("Inside the display method");
	}
	void show()
	{
		System.out.println("Inside the show method");
	}
	public static void main(String[] args)
	{
		ThisClass3 ts = new ThisClass3();
		ts.display();
	}

}
