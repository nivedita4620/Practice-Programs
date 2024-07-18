// OperatorDemo
package com.javacore.demo;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		int c=6;
		int result=a+b;
		//Arithmetic Operator
		System.out.println("Arithmetic Operators:");
		System.out.println("a + b = " + result);//+ operator a , b are called operands

		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
		
		
		// Relatinonal operator
		System.out.println("Relatinonal Operators:");
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		
		
		// bitwise operator
		/*
		 * Java defines several bitwise operators, 
		 * which can be applied to the integer types, long, int, 
		 * short, char, and byte.
Bitwise operator works on bits and performs bit-by-bit operation
		 */
		System.out.println("bitwise Operators:");
		int m=60; // 0011 1100
				//	 128 64 32 16  8 4 2 1
				//   0	 0	1   1  1 1 0 0	=60 
		int n=13; // 0   0  0  0   1 1 0 1  =13
		// a&b = 0000 1100 = 12
		/*
		 * a|b = 0011 1101 =61 
		   a^b = 0011 0001 =49 
           ~a  = 1100 0011 =

		 */
		
		result=m & n;
		System.out.println(result);
		
		result=m | n;
		System.out.println(result);
		
		result=m ^ n;
		System.out.println(result);
		
		result=m & n;
		System.out.println(result);
		
		result=m >> 2; // 15
		System.out.println("m >> 2" + result);
		
		result=m << 2; // 15
		System.out.println("m << 2" + result);
		
		// Ternary Operator
		int min=(a<b)? a : b;
		System.out.println(min);
		
		
		// assignemnt/complex operator
		System.out.println("assignemnt operator");
		System.out.println("a=a+b " + (a +=b)); 
		System.out.println("a=a-b " + (a -=b)); 
		System.out.println("a=a*b " + (a *=b)); 
		System.out.println("a=a/b " + (a /=b)); 
		
		
		// increment and decrement operators
		
		int x=8;
		int z=15;
		System.out.println("increment and decrement operator");
		System.out.println(x);
		System.out.println(x++); 
		System.out.println(x--);
		
		System.out.println(z);
		System.out.println(z++); 
		System.out.println(z--);
		
		//preincrement and post increment
		
		System.out.println(++x); //pre-increment operator
		System.out.println(x++); //post- increment operator
		
		System.out.println(++z); //pre-increment operator
		System.out.println(z++);
		
		
	}
	
	

}
