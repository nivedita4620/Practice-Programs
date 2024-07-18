package com.practice_exceptionhandling;

public class ExceptionHandling10
{
	static void anyMethod()
    {
        try
        {
            return;
        }
        catch (Exception e) 
        {
            return;
        }
        finally
        {
            System.out.println("finally Block");
        }
    }
     
    public static void main(String[] args) 
    {   
        anyMethod();
    }
}
