package com.practice_exceptionhandling;

public class ExceptionHandling6
{
	public static void main(String[] args) 
    {   
        try
        {
            String s = null;
             
            int i = s.length();
        }
        catch (NullPointerException e) 
        {
            System.out.println(2);
        }
        catch (Exception e) 
        {
            System.out.println(1);
        }
        
    }
}
