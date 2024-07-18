package com.class_programs;

class object
{
	
}
class GrandParent
{
	int z;
	public void grandParentMehod()
	{
		System.out.println(z);
	}
}
class Parent extends GrandParent 
{
	int i;
	public void parentMethod()
	{
		System.out.println(i);
	}
}
class Child extends Parent
{
	int j;
	public void childMethod()
	{
		System.out.println(j);
	}
}
public class Simple_Inheritance
{

	public static void main(String[] args)
	{
		Parent p =new Parent();
		p.i=10;
		p.parentMethod();
		Child c = new Child();
		c.i=20;//parent class property
		c.j=20;//child class property
		
		c.childMethod();// child class method
		c.parentMethod();//parent class method
		c.toString();//object class method
		c.hashCode();// object class method
		
		GrandParent gp = new GrandParent();
		gp.z=26;
		gp.grandParentMehod();
				
	}

}
