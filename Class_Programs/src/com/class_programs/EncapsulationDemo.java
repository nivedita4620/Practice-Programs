package com.class_programs;

class Student
{
	//wrapping of the data into a single unit is called as encapsulation.
	int id;
	String name;
	String address;
	String email;

void display()
{
	System.out.println(id+""+name+""+address+""+email);
}
}
public class EncapsulationDemo
{

	public static void main(String[] args) 
	{
		Student st1 = new Student();
		//st1.display();
		st1.id=101;
		st1.name="Niuu";
		st1.address="solapur";
	}

}
