package com.iodemo;

public class Person
{	
	private int pid;
	private String p_name;
	
	public Person(int pid, String p_name) {
		super();
		this.pid = pid;
		this.p_name = p_name;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getP_name()
	{
		return p_name;
	}

	public void setP_name(String p_name)
	{
		this.p_name = p_name;
	}

	@Override
	public String toString()
	{
		return "Person [pid=" + pid + ", p_name=" + p_name + "]";
	}
	
	
	

}
