package com.ait.finallyblock;

public class MyClass2 {

	public static void main(String[] args) {
		try
		{
			int i;
			return;
		}
		catch(Exception e)
		{
			System.out.print("CatchBlock");
		}
		finally
		{
			System.out.println("FinallyBlock");
		}
	}
}





