package collection.demo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo2
{
	public static void main(String [] args)
	{
		Deque<String>dq = new LinkedList<String>();
		
		// adding elements to queue in different ways
		dq.add("Nivedita");
		// add element at first 
		dq.addFirst("Akanksha");
		// add element at last 
		dq.addLast("Tushar");
		
		// offer work as a add
		dq.offer("Kaushik");
		dq.offerFirst("Rajat");// it goes first 
		System.out.println("Name of the List:" +dq);
	}

}
