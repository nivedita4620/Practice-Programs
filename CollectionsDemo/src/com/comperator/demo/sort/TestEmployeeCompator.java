package com.comperator.demo.sort;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeCompator {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(111,"Nivedita",20000);
		Employee emp2 = new Employee(102,"Akanksha",10000);
		Employee emp3 = new Employee(100,"Harsh",30000);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		System.out.println("Before Sorting");
		System.out.println(emplist);
		
		//System.out.println("After Sorting");
		//EmpIDComparator id = new EmpIDComparator ();
		//Collections.sort(emplist,id);
		//System.out.println(emplist);
		
//		System.out.println("After Sorting");
//		EmpSalaryComparator sal = new EmpSalaryComparator();
//		Collections.sort(emplist,sal);
//		System.out.println(emplist);
		
		System.out.println("After Sorting");
		EmpNameComparator name = new EmpNameComparator();
		Collections.sort(emplist,name);
		System.out.println(emplist);
		
	}

}
