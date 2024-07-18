//VariableDemo
package com.javacore.demo;

public class VariableDemo {

	
		int marks; // instance variable 
		public void displayMarks()
		{
			int marks = 0;
			marks=marks+100;
			//marks=0+100;
			//marks=100;
			System.out.println("My Marks are "+ marks);
		}
		public static void main(String[] args) {
			
			VariableDemo vd=new VariableDemo();// craeting the object for the class with which i can call the method
			vd.displayMarks();

		

	}

}
