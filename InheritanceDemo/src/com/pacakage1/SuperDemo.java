package com.pacakage1;

class SuperPrime
{
	String name;
}
public class SuperDemo extends SuperPrime
{
	String name;
	
	public void details()
	{
		super.name="Parent";
		name="Child";
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		SuperDemo sup = new SuperDemo();
		sup.details();
	}

}
