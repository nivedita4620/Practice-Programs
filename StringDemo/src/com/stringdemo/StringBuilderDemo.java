package com.stringdemo;
/*StringBuilder is mutable.
* StringBuilder Storage: Heap
* All methods are non-synchronized. Thread is not safe.*/
public class StringBuilderDemo 
{

	public static void main(String[] args) 
	{
		//capacity
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		
		//16 bit + length
		StringBuilder sb2 = new StringBuilder("Nivedita");
		System.out.println(sb2.capacity());
		
		// digit
		StringBuilder sb3 = new StringBuilder(2000);
		System.out.println(sb3.capacity());
		
		//append		
		StringBuilder sb4 = new StringBuilder();
		System.out.println(sb2.append(" Sonkawade"));
				
		//charAt()
		StringBuilder sb5 = new StringBuilder("Nivedita Sonkawade");
		System.out.println(sb5.charAt(3));
				
		//delete()
		StringBuilder sb6 = new StringBuilder("Nivedita");
		System.out.println(sb6.delete(2, 8));
				
		//deleteCharAt()
		StringBuilder sb7 = new StringBuilder("Nivedita");
		System.out.println(sb7.deleteCharAt(3));
				
		//insert()
		//StringBuilder sb8 = new StringBuilder("Nivedita");
		System.out.println(sb2.insert(2, "ttt"));
		
		//reverse
		StringBuilder sb8 = new StringBuilder("Nivedita");
		System.out.println(sb8.reverse());
		
		//subsequence
		StringBuilder sb9 = new StringBuilder("Nivedita");
		System.out.println(sb9.subSequence(3, 6));
				
		//replace()
		System.out.println(sb2.replace(2, 6, "n"));
				
				
	}

}
