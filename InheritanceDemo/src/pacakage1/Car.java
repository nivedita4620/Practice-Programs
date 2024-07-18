package pacakage1;
// has a relationship 
class Vehicle
{
	String brand = "Martuti"; // vehicle attribute
	public void honk()			// vehicle method
	{
		System.out.println("beep beep!......");
	}
}
public class Car extends Vehicle
{
	String modelName= "Maruti800";	// car attribute

	public static void main(String[] args) 
	{
		Car myCar =new Car();// create mycar object
		myCar.honk(); // call honk() method frm vehicle class on myCar object
		
		// display record
		System.out.println(myCar.brand + " "+ myCar.modelName);
	}

	
}
