package com.ait.finallyblock;

public class MyClass {
	public static void main(String[] args) {
		try
		{ 
			int data = 30/3; 
			System.out.println(data); 
		} 
		catch(NullPointerException e)
		{
			System.out.println(e);
		} 
		finally
		{
			System.out.println("finally block is always executed");
		}
	}
}




