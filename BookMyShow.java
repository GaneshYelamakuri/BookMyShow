package com.jsp.packagepractice;

import java.util.Scanner;

class Theatre
{
	int seats=50;
	private  static Theatre t=null;
	private Theatre()
	{}
	public static Theatre getInstance() 
	{  
		
		if(t==null) t=new Theatre();
		return t;
	}
	public void reserveSeats(int numSeats)
	{
		if(numSeats>seats)
		{
			System.out.println(numSeats+"are not available");
			System.out.println(seats+"are available");
			return;
		}
		seats=seats-numSeats;
		System.out.println(numSeats+"seats are reseverd");
		System.out.println(seats+"are available");
	}
	
}
class BookingApp
{
	public void bookTickets() 
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("Tickets:");
		int numTickets= scn.nextInt();
		
		Theatre theatre=Theatre.getInstance();
		theatre.reserveSeats(numTickets);
	}
}

public class BookMyShow {

	public static void main(String[] args)
	{
		BookingApp cost1=new BookingApp();
		cost1.bookTickets();
		
		BookingApp cost2=new BookingApp();
		cost2.bookTickets();
		
		BookingApp cost3=new BookingApp();
		cost3.bookTickets();
	}

}
