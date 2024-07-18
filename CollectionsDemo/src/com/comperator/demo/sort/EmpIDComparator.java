package com.comperator.demo.sort;

import java.util.Comparator;

//sort pgm
public class EmpIDComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
		if(o1.getEmp_ID() > o2.getEmp_ID())
		{
			return 1;
		}
		else if(o1.getEmp_ID() < o2.getEmp_ID())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
