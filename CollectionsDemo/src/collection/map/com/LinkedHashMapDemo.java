package collection.map.com;

// sequence is does not matter
// duplicate values are not allowed
// multiple null values alloewd

import java.util.LinkedHashMap;

public class LinkedHashMapDemo
{

	public static void main(String[] args) 
	{
		LinkedHashMap <Integer, String> lm = new LinkedHashMap<Integer,String>();
		
		lm.put(1,"Nivedita");
		lm.put(3,"Akanksha");
		lm.put(33,"Harsh");
		lm.put(10,null);
		lm.put(100,null);
		lm.put(1,"Nivedita");
		lm.put(null,null);
		lm.put(null,null);
		lm.put(null,"abc");
		//lm.put(1,"pqr");
		System.out.println(lm);
	}

}
