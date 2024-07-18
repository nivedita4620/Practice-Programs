package com.interfacedemo;

public class Recatagle implements Shape
{
	private double length;
	private double width;
	public Recatagle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@override 
	public double getArea()
	{
		return  length * width;
	}

}
