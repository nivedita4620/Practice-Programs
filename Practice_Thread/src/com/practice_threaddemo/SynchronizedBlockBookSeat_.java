package com.practice_threaddemo;
class BookSeat1
{
	int total_seats=10;
	 void bookSeat1(int seats)
	{
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		
		synchronized(this)
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
		
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
		System.out.println("Hi : "+Thread.currentThread().getName());
	}
}
public class SynchronizedBlockBookSeat_ extends Thread
{
	static BookSeat1 b;
	int seats;
	public void run()
	{
		b.bookSeat1(seats);
	}
	public static void main(String[] args)
	{
		b= new BookSeat1();
		SynchronizedBlockBookSeat_ niuu = new SynchronizedBlockBookSeat_();
		niuu.seats=7;
		niuu.start();
		
		SynchronizedBlockBookSeat_ sonu = new SynchronizedBlockBookSeat_();
		sonu.seats=6;
		sonu.start();
		
	}

	

}
