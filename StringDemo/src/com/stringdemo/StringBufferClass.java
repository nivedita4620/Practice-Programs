package com.stringdemo;

public class StringBufferClass {

	public static void main(String[] args) 
	{
		// string is immutable
		// StringBuffer and StringBuilder are mutable
		//StringBuffer objects are thread safety
		StringBuffer sb = new StringBuffer("JAVA");
		//sb.replace(0, 0, null);
		//sb.substring(0);
		
		System.out.println(sb);
		
		//StringBuilder objects are not thread safety
		StringBuilder sb1 = new StringBuilder();
		sb1.replace(0, 0, null);
		
		
		
	}

}
