package com.practice_threaddemo;
class BookSeat
{
	int total_seats=10;
	synchronized void bookSeat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println( seats +" Seats are booked");
			total_seats=total_seats-seats;
			System.out.println("Seats Left:"+total_seats);
		}
		else
		{
			System.out.println("Sorry seats cannot be booked");
			System.out.println("Seats Left: " +total_seats);
		}
	}
}
public class SynchronizationMethodDemo extends Thread
{
	static BookSeat b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		b= new BookSeat();
		SynchronizationMethodDemo niuu = new SynchronizationMethodDemo();
		niuu.seats=7;
		niuu.start();
		
		SynchronizationMethodDemo sonu = new SynchronizationMethodDemo();
		sonu.seats=6;
		sonu.start();
		
	}

}
