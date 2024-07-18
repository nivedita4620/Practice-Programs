package collection.demo;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class IteratorDemo
{

	public static void main(String[] args) 
	{
		LinkedList <String> l1 = new LinkedList <>();
		l1.add("Nivedita");
		l1.add("A");
		l1.add("10");
		l1.add("2.5f");
		l1.add("null");
		l1.add("0");
		System.out.println("List is:"+l1);
		
		// by using iterator
		System.out.println("Iterator List is:"+l1);
		Iterator iterator = l1.iterator();
		System.out.println("The List of Iterator is as follows:"); 
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		// by using list iterator
		ListIterator list_ite = l1.listIterator();
		
		 System.out.println("The List of List Iterator is as follows:"); 
	        while(list_ite.hasNext())
	        { 
	           System.out.println(list_ite.next()); 
	         } 
	}

}
