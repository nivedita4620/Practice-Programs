package collection.demo;

import java.util.HashMap;
import java.util.HashSet;

public class MapDemo
{

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add("Nivedita");
		
		HashMap<Integer, String> m  = new HashMap();
		
		m.put(2,"padmaja");
		m.put(10,"niuu");
		m.put(22,"Nivedita");
		m.put(4,"harsh");
		m.put(7,"akanksha");
		//m.isEmpty();
//		m.remove(5);
//		m.get(12);
//		m.containsKey(1);
//		m.entrySet();
		System.out.println(m);
	}

}
