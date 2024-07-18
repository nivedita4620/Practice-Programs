package com.practice_collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map map = new HashMap();
		//put()
		map.put(101, "Nivedita");
		map.put(102, "Akanksha");
		map.put(103, "Harsh");
		map.put(101, "Nivedita");
		map.put(null, null);
		
		//map.clear==>{}
		//containsKey()
		System.out.println(map.containsKey(101));
		System.out.println(map.containsKey(105));
		
		//containsValue
		System.out.println(map.containsValue("Nivedita"));
		System.out.println(map.containsValue("Harsh"));
		
		System.out.println(map.get(101));
		//System.out.println(map.remove(102));
		map.replace(101, "Niuu");
		map.size();
		System.out.println(map);
	}

}
