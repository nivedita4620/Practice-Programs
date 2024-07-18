package collection.map.com;

// data is store in sorted(keys are sorted) 
// duplicate values are  allowed in treeMap
// duplicate keys are not allowed
// single is value of null is allowed
import java.util.TreeMap;

public class TreeMapDemo
{

	public static void main(String[] args) 
	{
		TreeMap <Integer, String> lm = new TreeMap<Integer,String>();
		
		lm.put(1,"Nivedita");
		lm.put(3,"Akanksha");
		lm.put(33,"Harsh");
		lm.put(10,null);
		lm.put(100,null);
		lm.put(5,"Nivedita");
		lm.remove(1);
		lm.containsKey(33);
//		lm.put(null,null);
//		lm.put(null,null);
//		lm.put(null,"abc");
		//lm.put(1,"pqr");
		System.out.println(lm);
		System.out.println(lm.containsKey(5));
	}

}
