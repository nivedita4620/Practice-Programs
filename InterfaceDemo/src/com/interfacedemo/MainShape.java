package com.interfacedemo;

public class MainShape
{
	public static void main(String args[])
	{	
		Recatagle r1 = new Recatagle  (10,13);
		Circle c1= new Circle(3);
		Triangle t1 = new Triangle(4,5);
		System.out.println("Area of Rectangle is "+r1.getArea());
		System.out.println("Area of a Circle is " +c1.getArea());
		System.out.println("Area of a Triangle is " +t1.getArea());
	}
}
