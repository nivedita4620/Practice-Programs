package collection.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo
{
	public static void main(String args [])
	{
		Set link_hash_set = new LinkedHashSet ();
		
		link_hash_set.add("Nivedita");
		link_hash_set.add(10);
		link_hash_set.add(null);
		link_hash_set.add(10);
		link_hash_set.add(2.5);
		link_hash_set.add(true);
		link_hash_set.add('N');
		link_hash_set.addAll(link_hash_set);
		link_hash_set.size();
		//link_hash_set.clear();==>[]
		link_hash_set.contains(true);
		System.out.println(link_hash_set);
	}
}
