package com.ait.finallyblock;

class Bike
{
	public void petrol() 
	{

	}
}

public class MyClass3 {

	public static void main(String[] args) {
		Bike fz = null;
		try
		{
			fz.petrol();
		}
		catch(NullPointerException e)
		{
			System.out.print("There is a NullPointerException ");
		}
		catch(Exception e)
		{
			System.out.print("There is an Exception. ");
		}
		System.out.print("Everything went fine ");
	}
}




