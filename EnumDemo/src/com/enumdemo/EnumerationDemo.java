package com.enumdemo;


enum Direction
{
	North,
	South,
	East,
	West
}

enum Days
{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday
}

enum Month
{
	Jan,
	Feb,
	Mar,
	Apr,
	May
}

enum weekdays
{
	Saturday,
	Sunday
}
public class EnumerationDemo 
{

	public static void main(String[] args) 
	{
		//Direction di1 = Direction.North;
		//Direction di2 = Direction.South;
		
		//System.out.println("First Direction" +di1);
		//System.out.println("First Direction" +di2);
		/*for(Direction dir : Direction.values())
		{
			System.out.println(dir);
		}*/
		
		Direction dir = Direction.North;
		if(dir == Direction.East)
			System.out.println("Direction: East");
		
		else if(dir == Direction.West)
		{
			System.out.println("Direction: West");
		}
		
		else if(dir == Direction.North)
		{
			System.out.println("Direction: North");
		}
		
		else if(dir == Direction.South)
		{
			System.out.println("Direction: South");
		}
		
		
		Days day = Days.Monday;
		
		if(day==Days.Monday)
			
			System.out.println("Day: Monday");
		else if(day==Days.Tuesday)
		{
			System.out.println("Day : Tuesday");
		}
		
		else if(day==Days.Wednesday)
		{
			System.out.println("Day : Wednesday");
		}
		
		else if(day == Days.Thursday)
		{
			System.out.println("Day: Thursday");
		}
		else if(day == Days.Friday)
		{
			System.out.println("Day: Friday");
		}
		
		weekdays wd = weekdays.Saturday;
		if(wd==weekdays.Saturday)
			
			System.out.println("WeekDay: Saturday");
		else if(wd==weekdays.Sunday)
		{
			System.out.println("WeekDay : Sunday");
		}
		
		Month mon = Month.Jan;
		if(mon==Month.Jan)
			
			System.out.println("Month: Jan");
		else if(mon==Month.Feb)
		{
			System.out.println("Month : Feb");
		}
		
		else if(mon==Month.Mar)
		{
			System.out.println("Month : Mar");
		}
		
		else if(mon == Month.Apr)
		{
			System.out.println("Month: Apr");
		}
		else if(mon == Month.May)
		{
			System.out.println("Day: May");
		}
	}

}
