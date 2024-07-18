package com.javademo;
// Abstration: hiding the data
abstract class Employee1
{
	abstract void salary(); // method declaration
}
class PermanatEmployee extends Employee1
{
	void salary() // method defination(body is given)
	{
		System.out.println("Basic+Bonus+leave+HRA");
	}
}
class TempEmployee extends Employee1
{
	void salary()// method defination(body is given)
	{
		System.out.println("Basic+HRA+leave");
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
