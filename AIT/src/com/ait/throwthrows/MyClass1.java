package com.ait.throwthrows;

public class MyClass1 {
	public static void validate(int age)
	{
		if(age<21||age>27)

			throw new ArithmeticException("not eligeble");
		else
			System.out.println("Eligeble to attend Military Selection");
	}


	public static void main(String[] args) {
		try
		{
			validate(30);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
