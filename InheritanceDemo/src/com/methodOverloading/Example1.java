package com.methodOverloading;

public class Example1
{
	public void createConcate(String name, int num)
	{
		System.out.println("Name : "+name + " Number : "+num);
	}

	public void createConcate(String name, int num1,int num2)
	{
		System.out.println("Name : "+name + " Number1 : "+num1+ " Number2 : "+num2);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Example1 con1= new Example1();
		
		con1.createConcate("Nivedita", 96321540);
		con1.createConcate("Akanksha", 8563240,98746);

	}

}
