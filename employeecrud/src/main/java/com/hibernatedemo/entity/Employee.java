package com.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int empId;
	@Column (name ="FirstName", length=20)
	private String empName;
	@Column(name ="LastName",length =20)
	private String surname;
	@Column (length=10)
	private String phone;
	@Column(length=100)
	private String address;
	@Column(length=50)
	private String designation;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empNme, String surname, String phone, String address, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.surname = surname;
		this.phone = phone;
		this.address = address;
		this.designation = designation;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpNme() {
		return empName;
	}


	public void setEmpNme(String empNme) {
		this.empName = empNme;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNme=" + empName + ", surname=" + surname + ", phone=" + phone
				+ ", address=" + address + ", designation=" + designation + "]";
	} 
	
	
	
}
