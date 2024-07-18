package com.stringdemo;
/*
 * StringBuffer is mutable.
 * StringBuffer Storage: Heap
 * If data is constantly changing like calculator. we should use StringBuffer.
 * All methods are synchronized. Thread is safe.*/
public class StringBufferDemo 
{

	public static void main(String[] args)
	{
		// Capacity method
		StringBuffer str_buf = new StringBuffer();
		System.out.println(str_buf.capacity());
		
		StringBuffer str_buf1 = new StringBuffer("Nivedita");
		System.out.println(str_buf1.capacity());  // 16 bit + length of string
		
		StringBuffer str_buf2 = new StringBuffer(1000);
		System.out.println(str_buf2.capacity());
		
		// Append method
		str_buf1.append("Hello");
		System.out.println(str_buf1.capacity());
		
		StringBuffer sb = new StringBuffer();
		System.out.println(str_buf1.append("Sonkawade"));
		
		//charAt()
		StringBuffer sb1 = new StringBuffer("Nivedita Sonkawade");
		System.out.println(sb1.charAt(3));
		
		//delete()
		StringBuffer sb2 = new StringBuffer("Nivedita Sonkawade");
		System.out.println(sb2.delete(2, 8));
		
		//deleteCharAt()
		StringBuffer sb3 = new StringBuffer("Nivedita Sonkawade");
		System.out.println(sb3.deleteCharAt(3));
		
		//insert()
		//StringBuffer sb4 = new StringBuffer("")
		System.out.println(str_buf1.insert(2, "ttt"));
		
		//replace()
		System.out.println(str_buf1.replace(2, 6, "n"));
		
		//reverse
		System.out.println(str_buf1.reverse());
		
		//subsequence
		System.out.println(sb1.subSequence(3, 6));
	}

}
