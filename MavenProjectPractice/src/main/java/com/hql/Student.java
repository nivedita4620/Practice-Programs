package com.hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int rollno;
	private String name;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city=city;
	}
	Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}



}
