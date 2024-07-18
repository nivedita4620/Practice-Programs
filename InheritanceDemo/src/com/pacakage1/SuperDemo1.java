package com.pacakage1;
//  child class refering parent class method using super keyword
class SuperParent
{
	String name;
	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}
public class SuperDemo1 extends SuperParent
{
	String name;
	public void details()
	{
		super.details();
		name="Child";
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		SuperDemo1 sup = new SuperDemo1();
		sup.details();
	}

}
