package com.ait.exception;

public class MyClass6 {
public static void main(String[] args) {
		MyClass5 ob=new MyClass5();
		try
		{
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException thrown by meth1() method is caught in main()method");
		}

	}
	public void meth1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(Exception e)
		{
			System.out.println("We have an Exception" +e);
		}
		System.out.println("Outside try catch-block");

	}

}
