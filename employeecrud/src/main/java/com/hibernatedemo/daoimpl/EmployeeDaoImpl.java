package com.hibernatedemo.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernatedemo.dao.EmployeeDao;
import com.hibernatedemo.entity.Employee;
import com.hibernatedemo.hibernateutil.HiberUtil;

public class EmployeeDaoImpl implements EmployeeDao  
{

	@Override
	public void addEmp()
	{
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee First Name:");
		String name = sc.next();
		
		System.out.println("Enter Employee Last Name:");
		String surname = sc.next();
		
		System.out.println("Enter Employee Address :");
		String address = sc.next();
		
		System.out.println("Enter Employee Designation:");
		String designation = sc.next();
		
		System.out.println("Enter Employee Phone Number:");
		String phone = sc.next();
		
		Employee emp = new Employee();
		emp.setEmpNme(name);
		emp.setSurname(surname);
		emp.setPhone(phone);
		emp.setAddress(address);
		emp.setDesignation(designation);
		
		session.save(emp);
		tr.commit();
		session.close();
		System.out.println("Employee added succssfully");
		
	}

	@Override
	public void editEmp() 
	{
		
	}

	@Override
	public void deleteEmp() 
	{
		
	}

	@Override
	public void getEmp() 
	{
		
	}

}
