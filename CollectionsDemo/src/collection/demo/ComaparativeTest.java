package collection.demo;

import java.util.ArrayList;
import java.util.Collections;

/*Comparable and Comparator both are interfaces and can be used to sort collection elements.
 * there are many differences between Comparable and Comparator interfaces
 * Comparable provides a single sorting sequence. 
 * In other words, we can sort the collection on the basis of a single element such as id, name, and price.
 * The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
 * Comparable provides compareTo() method to sort elements
 * Comparable provides compare() method tosort elements
 * Comparable is present in java.lang package.
 * A Comparator is present in the java.util package.
 */

//Comparable
class Employee implements Comparable<Employee>//only emp tyoe of data will compare
{
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) 
	{
		if(age == o.age )
		{
			return 0;
		}
		else if(age > o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
}
public class ComaparativeTest
{

	public static void main(String[] args) 
	{
		ArrayList<Employee> obj = new ArrayList<Employee>();	
		Employee emp1 = new Employee(101,"Nivedita",22);
		Employee emp2 = new Employee(102,"Harsh",18);
		Employee emp3 = new Employee(103,"Akanksha",23);
		Employee emp4 = new Employee(104,"Ram",32);
		
		obj.add(emp1);
		obj.add(emp2);
		obj.add(emp3);
		obj.add(emp4);
		
		Collections.sort(obj);
		for (Employee e:obj)
		{
			System.out.println(e.id+ " "+e.name+ " "+e.age);
		}
		
	}

}
