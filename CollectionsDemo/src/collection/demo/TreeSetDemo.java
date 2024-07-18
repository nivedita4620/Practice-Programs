package collection.demo;
// sorting order follows
// insertion order does not follow
// store only homogenous data i.e same data type elements
// can not store null values
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args)
	{
		TreeSet tree_set  = new TreeSet();
		
		tree_set.add(30);
		tree_set.add(90);
		tree_set.add(10);
		tree_set.add(50);
		tree_set.add(0);
		//==>[0, 10, 30, 50, 90]

//		tree_set.add("Nivedita");
//		tree_set.add("Akanksha");
//		tree_set.add("Mili");
//		tree_set.add("Manasi");
//		tree_set.add("Yogada");
//		tree_set.add("Anushri");
//		tree_set.add("Sayali");
		//==>[Akanksha, Anushri, Manasi, Mili, Nivedita, Sayali, Yogada]

		//tree_set.add('N');
		//tree_set.add(true);
		//tree_set.add(10);
		//tree_set.add(null);
		//tree_set.add(2.5f);
		//tree_set.clear();
		System.out.println(tree_set);
	}

}
