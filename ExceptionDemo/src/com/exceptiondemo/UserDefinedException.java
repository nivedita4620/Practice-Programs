package com.exceptiondemo;
/*Hirearchy of Exception
 * Throwable
 * Exception
 * RuntimeException
 * IndexOutofBoundsExceptio
 * ArrayIndexOutOfBoundsException
   MeraException*/
class MeraException extends Exception
{
	private int ex;

	public MeraException(int ex) {
		super();
		this.ex = ex;
	}

	@Override
	public String toString() 
	{
		return "MeraException [ex=" + ex + "]";
	}
}
public class UserDefinedException
{
	void sum(int a, int b) throws MeraException
	{
		if(a<0) 
		{
			throw new MeraException(a);
		}
		else
		{
			System.out.println("Addiion is:"+(a+b));
		}
	}
	public static void main(String[] args) throws MeraException 
	{
		UserDefinedException ud = new UserDefinedException();
		ud.sum(-10,10);
	}

}
