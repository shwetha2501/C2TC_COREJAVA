package com.ait.throwthrows;

public class MyClass2 {
	public static void validate(int age)
	{
		if(age<21||age>30)

			throw new ArithmeticException("not Eligeble");
		else
			System.out.println("Eligeble to attend the Military Selection");
	}


	public static void main(String[] args) {
		try
		{
			validate(21);

		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}

}
