package collection.demo;
//abstract class =can not instantiate(u can not create the object of abstarct class and interface)
//interface 

import java.util.ArrayList;
// abstract class -> Instantiate( u can't create the object of abstract class and interface)
import java.util.List;

public class ArrayListDemo
{
	// ArrayList-> Maintaining the insertion order
	//modification(Insertion and deletion) of the data in array list is time consuming 	
	//Duplicates are allowed in array list
	// multiple null are allowed in array list
	//retrival of data in array list is possible.

	public static void main(String[] args)
	{
		//List list = new ArrayList();
		//or
		//creating object of ArrayList class
		ArrayList list = new ArrayList();
		// adding different data types
		list.add(5);
		list.add("Nivedita");
		list.add('N');
		list.add(true);
		list.add('E');
		list.add(10.5f);
		list.add("Nivedita");
		list.add("Nivedita");
		System.out.println(list);
		
		// string values
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("One"); //0 index
		list2.add("Two");//1 index
		list2.add("Three");//2 index
		// printing the size of second list object
		System.out.println(list2.size());//output 3
		
		list2.add("Four "); // 3 index
		list2.add("Five");// 4 index
		
		System.out.println(list2.size());//output5
		
		
		list2.remove("Two");
		System.out.println(list2.size()); //output 4
		
		list2.add(1,"Two");// 1 index
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		System.out.println(list2);
	}

}
