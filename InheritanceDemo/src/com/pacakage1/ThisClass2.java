package com.pacakage1;
// parameter we pass reference of thisclass2
public class ThisClass2
{
	int a;
	int b;
	
	ThisClass2()
	{
		a=10;
		b=20;
	}
	 public void display(ThisClass2 test) // test ->reference test=ts 
	 {
		 System.out.println(a);
		 System.out.println(b);
	 }
	 
	 public void get()
	 {
		 display(this);
	 }
	public static void main(String[] args) 
	{
		ThisClass2 ts = new ThisClass2();
		ts.get();
	}

}
