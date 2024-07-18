package com.hibernatedemo;

import java.util.Scanner;

import com.hibernatedemo.daoimpl.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	char a;
    	EmployeeDaoImpl daoimpl = new EmployeeDaoImpl();
    	do
    	{
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Employee Registration");
    		System.out.println("1. Add \n 2. Edit \n 3. Delete \n 4.Get");
    		System.out.println("Enter the Choice :");
    		int ch = sc.nextInt();
    		switch(ch)
    		{
    		case 1:
    		{
    			daoimpl.addEmp();
    			break;
    		}
    		case 2:
    		{
    			daoimpl.editEmp();
    			break;
    		}
    		case 3:
    		{
    			daoimpl.deleteEmp();
    			break;
    		}
    		case 4:
    		{
    			daoimpl.getEmp();
    			break;
    		}
    		case 5:
    			System.exit(0);
    			break;
    		}
    		System.out.println("Do you want tocontinue Y/N");
    		a= sc.next().charAt(0);
    	}
    	while (a=='Y'||a=='y');
    	System.out.println("Thank You");
    
    }

    }

