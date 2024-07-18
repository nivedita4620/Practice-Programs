package com.interfacedemo;

// interfaces, another way to implementing abstraction in java.
// by default all the methods in the interfaces are abstract
// interfaces should have all the abstect methods
// all the methods in interface are your abstract method no concrete method till java 1.8 version.
// after 1.8 version you can add concrete method in interface but they must be default and static.
// the abstract in the interface can not be private
// by default the field in the interfaces are public static and final
// we can not create object of the interface
// cannot create a object of a interface
// cannot create iib and sib in inerface
interface InterfaceSample
{	
	
	 int i=0;
	 void display();
	 
	  void show();
	 
}

interface Sample
{
	void xyz();
}
class ABC implements InterfaceSample, Sample
{

	@Override
	public void display()
	{
		//System.out.println(i++);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		//InterfaceSample is = new InterfaceSample(); //Cannot instantiate the type InterfaceSample
		
		
	}

}
