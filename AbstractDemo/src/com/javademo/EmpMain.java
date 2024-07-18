package com.javademo;
// Encapsulation : wrapping data into a single unit
class Employee
{
	private int id;
	private String name;
	private String design;
	private String sal;
	private String dob;
	private String username;
	private String password;
	
	public Employee() // encapsulation
	{
		super();
	}

	public Employee(int id, String name, String design, String sal, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.design = design;
		this.sal = sal;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", design=" + design + ", sal=" + sal + ", dob=" + dob
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
}
public class EmpMain
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
