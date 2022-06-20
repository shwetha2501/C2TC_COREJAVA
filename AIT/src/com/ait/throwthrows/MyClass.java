package com.ait.throwthrows;

public class MyClass {
	public static void validate(int age)
	{
		if(age<21||age>27)
			throw new ArithmeticException("not eligeble");
		else
			System.out.println("Eligeble to attend Military Selection");
	}

	public static void main(String[] args) {
		validate(30);
		System.out.println("rest of the code");


	}

}
