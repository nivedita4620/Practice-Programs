package collection.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;
public class DequeDemo
{

	public static void main(String[] args) 
	{
		Deque dq = new ArrayDeque();
		dq.add(10);
		dq.addAll(dq);
		dq.addFirst(15);
		//dq.addLast("Nivedita");
		//dq.clear();
		//dq.contains(dq);
	System.out.println(dq);
		
	try
		{
		dq.add(12);
			dq.add(15.5);
		dq.add(20);
		dq.add(20);
		dq.add("Nivedita");
			//dq.addAll(null);
			dq.addFirst(5);
			dq.addLast(22);
			//dq.clear();==>>[]
		} 
		catch (NullPointerException  e)
	{
		System.out.println("Null Value");
		}
		System.out.println(dq);
		
//		ArrayDeque dq =new ArrayDeque();
//		dq.add("Nivedita");
//		dq.add(1);
//		dq.add(true);
//		dq.add("hi");
//		dq.add(2.3);
//		dq.add(30);
//		
//		
//		try
//		{
//			dq.add(null);
//		}
//		catch (NullPointerException e) {
//			System.out.println("don't use null");
//		}
//		System.out.println(dq);
	}

}
