package com.ait.finallyblock;

public class Cmpltnfail {

	public static void main(String[] args) {
		float pi = new Float(3.14f);
		if (pi > 3)
		{
			System.out.print("pi is bigger than 3");
		}
		else 
		{
			System.out.print("pi is not bigger than 3.");
		}
		finally 
		{
			System.out.println("Have a nice day.");

		}

	}
}
