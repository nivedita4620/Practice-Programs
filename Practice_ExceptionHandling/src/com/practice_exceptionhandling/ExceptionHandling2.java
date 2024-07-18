package com.practice_exceptionhandling;

public class ExceptionHandling2 
{
	public static void main(String[] args) 
    {
        int i = 1;
         
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
         
        System.out.println(i);
    }
}
