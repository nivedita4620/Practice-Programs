package com.comperator.demo.sort;

public class Employee
{
	private int empID;
	private String name;
	private double salary;
	
	public Employee(int empID, String name, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		
		
	}

	public int getEmp_ID() {
		return empID;
	}

	public void setEmp_ID(int emp_ID) {
		this.empID = emp_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
