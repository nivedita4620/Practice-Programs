package com.class_programs;

class bank_details
	{
	int emp_id,cust_account_no;
	String emp_name,cust_name;
	float emp_sal,balance;
	
	public void store()
	{
		
	}
	
	public void view_emp_Data()
	{
		System.out.println("Employee Details are:");
	}
	
	public void view_cust_details()
	{
		System.out.println("Customer Details are:");
		
	}
	
	public void check_balance()
	{
		System.out.println("Customer can check balance here: ");
	}
	
	public void current_acc()
	{
		
	}
	public void saving_acc()
	{
		
	}
}
	
public class class_bank
{
	public static void main(String[] args) 
	{
		bank_details b1 = new bank_details();
		
		b1.view_cust_details();
		b1.view_emp_Data();
		b1.check_balance();
	}

}
