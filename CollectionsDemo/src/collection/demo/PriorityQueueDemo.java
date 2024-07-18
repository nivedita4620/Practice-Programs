package collection.demo;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

import java.util.Queue;

/*
 * 1. The Queue Interface extends Collection interface. 
 * 2. It defines queue data structure which is normally First-In-First-Out. 
 * 3. Queue is a data structure in which elements 
 * are added from one end and elements are deleted from another end.
 * 4. But, exception being the Priority Queue in which elements are removed from one end,
 *   but elements are added according to the order defined by the supplied comparator.
 * 5. Queue is a data structure where elements are added from one end called tail 
 *   of the queue and elements are removed from another end called head of the queue.
 * 6. That means an element which is inserted first will be the first element to be 
 * removed from the queue.
 * Queue Properties
 * 1.Null elements are not allowed in the queue. 
 *2. If you try to insert null object into the queue, it throws NullPointerException.
 * Queue can have duplicate elements.
 * 3. In most of cases, elements are inserted at one end called tail of the queue and elements are removed 
 * or retrieved from another end called head of the queue.
 * 4. In the Queue Interface, there are two methods to obtain and remove the elements from 
 * the head of the queue. They are poll() and remove(). The difference between them is, poll()
 *  returns null if the queue is empty and remove() throws an exception if the queue is empty.
 * 5. There are two methods in the Queue interface to obtain the elements but don’t remove. 
 * They are peek() and element(). peek() 
 * returns null if the queue is empty and element() throws an exception if the queue is empty
 * 
 * Operation	       Throws An Exception If operation is not possible	     Returns null or false if operation is not possible
1. Add an element 
to the queue.	        add()	                                              offer()

2. Retrieve an element 
from the head of 
the queue.	            element()	                                          peek()

3. Retrieve And Remove
 an element from the
  head of the queue.    remove()	                                          poll()
 */

public class PriorityQueueDemo 
{

	public static void main(String[] args) 
	{
		PriorityQueue queue=new PriorityQueue();
		
		try
		{
			queue.add(null);
		}
		catch(NullPointerException ne)
		{
			System.out.println("don't enetr null value");
		}
		//queue.add(12);
		//queue.add(1);
		//queue.add(4);
		System.out.println(queue);
		
		 //queue.remove(1);
		//System.out.println(queue.poll());	
		try {
			System.out.println(queue.remove());	
		}
		catch(NoSuchElementException ne)
		{
			System.out.println("There is nothing in the object");
		}
		
		// peek() and  element()
		System.out.println(queue.peek());
        try
        {
        	System.out.println(queue.element());
        }
        catch(NoSuchElementException ex)
        {
        	System.out.println("There is nothing in the object1");
        }
		
	}
		
}
