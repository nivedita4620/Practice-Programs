package collection.demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkesListDemo 
{
//Linked list maintaing the insertion order
	// linkedkist allow the duplicate values
	//linked list can store multiple null values
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add('N');
		list.add(23);
		list.add("Nivedita");
		list.add(2.3);
		list.add(true);
		list.add("Nivedita");
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.addFirst(10);
		
		
		System.out.println(list);
		
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(2);
		list2.add(7);
		list2.add(10);
		list2.add(2);
		list2.add(7);
		list2.add(10);
		list.remove(10);
		list.get(3);
		list.getFirst();
		list.getLast();
		//list2.add("Nivedita");
		System.out.println(list2);
		
		
		
	}

}
