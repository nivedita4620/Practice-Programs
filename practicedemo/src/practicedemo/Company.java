package practicedemo;

abstract interface Employee
{
	abstract void show();
	void project();
	
	static void salary()
	{
		System.out.println("Employee Salary");
	}
}
class PermanentEmp implements Employee
{

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void project() 
	{
		// TODO Auto-generated method stub
		
	}

	
}
public class Company 
{

	public static void main(String[] args) 
	{
		//Employee emp1= new Employee();
		
	}

}
