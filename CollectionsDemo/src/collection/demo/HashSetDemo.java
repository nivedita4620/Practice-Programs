package collection.demo;

import java.util.ArrayList;
//HashSet does not follow insertion order
// duplicate values are not stored 
// does not follow sorting order
// cannot storemultiple null values
// data is stored acc to hashcode values
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo
{

	public static void main(String[] args)
	{
		
		ArrayList al = new ArrayList<>(); // 
		al.add("ABC");
		al.add("PQR");
		al.add("XYZ");
		HashSet hash_set = new HashSet(al);
		
		hash_set.add(10);
		hash_set.add("Nivedita");
		hash_set.add(10.5);
		hash_set.add(null);
		hash_set.add(0);
		hash_set.add(10);
		hash_set.add(true);
		hash_set.add("Nivedita");
		hash_set.addAll(hash_set);
		//hash_set.clear();==>[]
		System.out.println(hash_set.contains("Nivedita"));// Used to return true if an element is present in a set.
		hash_set.remove(10);//Used to remove the element if it is present in set.
		System.out.println(hash_set.size());
		hash_set.isEmpty(); // It is used to return true if this set contains no elements.
		
		System.out.println(hash_set);
		//or
		
		//using iterartor
//		Iterator itr =hash_set.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
	}

}
