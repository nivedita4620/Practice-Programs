package com.class_programs;

public class Car 
{
	int speed =60;
	void fullThrottle()
	{
		System.out.println("Full Throttle");
	}
	
	void speed()
	{
		System.out.println("Speed of the Car is:"+speed);
	}

	public static void main(String[] args) 
	{
		//int speed=60;
		Car myCar =new Car();
		myCar.fullThrottle();
		myCar.speed();
		
	}

}
