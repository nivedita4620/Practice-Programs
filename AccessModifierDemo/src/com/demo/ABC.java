package com.demo;

// private for same class 
// public for all class all package
//default for same package every where but no different package
// protected for same package and only inherited classes in other packages
public class ABC 
{
	public int a;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class PQR
{
	ABC a1 =new ABC();
	void display()
	{
		System.out.println(a1.a);
	}
}
class MNC extends ABC
{
	ABC a1 = new ABC();
	void show()
	{
		System.out.println(a1.a);
	}
			
}