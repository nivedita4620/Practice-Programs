package com.class_programs;

class Sample
{
	int x=5;
}

public class SampleFirst {
	
	int x= 10; // instance variable

	public static void main(String[] args) {
		
		SampleFirst sf1 = new SampleFirst();
		sf1.x=40;
		System.out.println(sf1.x);
		
		SampleFirst sf2 = new SampleFirst();
		System.out.println(sf2.x);
		
//		//Sample sm = new Sample();
//		System.out.println(sf1.x); //10
//		System.out.println(sf2.x); //10
//		System.out.println(sm.x); //5
		
	}

}
