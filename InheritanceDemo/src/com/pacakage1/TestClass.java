package com.pacakage1;
class Student
{
	int rollNo;
	String name;
	float fee;
	
	Student (int rollNo, String name, float fee)
	{
		this.rollNo = rollNo;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollNo + "" + name + " " + fee);
	}
}

public class TestClass
{

	public static void main(String[] args)
	{
		Student s1 = new Student (1, "Nivedita" ,1000);
		Student s2 = new Student (2, "Harsh" ,2000);
		s1.display();
		s2.display();
		
	}

}
