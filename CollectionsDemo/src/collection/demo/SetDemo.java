package collection.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo
{

	public static void main(String[] args) 
	{
		Set set = new LinkedHashSet();
		set.add(23);
		set.add(34);
		set.add(7);
		set.add(9);
		set.add(155);
		set.add('A');
		set.add("Nivedita");
		set.add(23);
		set.add(3.4);
		set.add(null);
		set.add(0);
		set.add(true);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(23));
		System.out.println(set.remove(23));
		System.out.println(set.removeAll(set));
		
		Set s1 = new LinkedHashSet();
		s1.add("abc");
		s1.add("pqr");
		s1.add("xyz");
		System.out.println(s1.addAll(s1));
		
		
		
		
		
	}

}
