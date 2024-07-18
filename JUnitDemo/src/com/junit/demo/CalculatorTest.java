package com.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	Calculator cal1;
	@Before
	public void setUp() throws Exception 
	{
		cal  = new Calculator();
		cal1 = new Calculator();
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void test() 
	{
		assertEquals(7,cal.add(4, 3) );
		assertEquals(4,cal.add(4, 0) );
		assertEquals(3,cal.add(0, 3) );
	}
	
	@Test
	public void test1() 
	{
		//assertEquals(7,cal.add(5, 3) );// error
		
	}
	

	@Test
	public void test2() 
	{
		int arr[] = {1,2,3,4,5,6};
		assertEquals(6,cal1.findMax(arr));
		
	}
	
	

}
