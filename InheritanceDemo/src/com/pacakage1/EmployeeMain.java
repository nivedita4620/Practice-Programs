package com.pacakage1;
// manager is a - employee
class Employee
{
	public int salary;	// attribute of employee class
	public Employee(int sal) // special type of method // constructor
	{
		salary=sal;
	}
	
	public void work() // method of employee class
	{
		System.out.println("Working as a employee");
	}
	public int getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	public Manager(int sal)
	{
		super(sal);
	}
	
	public void work()
	{
		System.out.println("Managing the Employee");
	}
	
	public void addEmployee()
	{
		System.out.println("Adding the new Employee");
	}
}
public class EmployeeMain
{

	public static void main(String[] args)
	{
		Employee emp = new Employee(40000);
		emp.getSalary();
		
		Manager man = new Manager(60000);
		man.getSalary();
		
		emp.work();
		System.out.println("Employee Salary" +emp.getSalary());
		
		man.work();
		System.out.println("Manager Salary:"+man.getSalary());
		
		man.addEmployee();
	}

}
