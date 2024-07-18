//package com.class_programs;
//public class data_type_example
//{
//	  public int CompareNum(int n1, int n2)   
//	    {   
//	        System.out.println("x = " + n1 + "\ny = " + n2);  
//	        if(n1>n2)  
//	        {
//	        	return n1;
//	        }
//	              
//	        else 
//	        {
//	            return n2; 
//	        }
//	    }  
//	      
//	    /* Driver Code */  
//	    public static void main(String ar[])   
//	    {  
//	    	data_type_example obj = new data_type_example();  
//	        int result = obj.CompareNum(15,24);  
//	        System.out.println("The greater number is: " + result);  
//	    }  
	
	
	
	
	
	
	
	
package com.class_programs;
public class data_type_example
	{
	
	public double CompareNum(double n1, double n2)
	{
		System.out.println("x = " + n1 + "\ny = " + n2);  
        if(n1>n2)  
        {
        	return n1;
        }
              
        else 
        {
            return n2; 
        }
	}
	
	public static void main(String ar[])   
    {  
    	data_type_example obj = new data_type_example();  
        double result = obj.CompareNum(15,24);  
        System.out.println("The greater number is: " + result);  
}  

}
