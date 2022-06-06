package com.ait.inheritance;



class Example
{
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result:" +result);
	}

}
class Example2 extends Example
{
	void subtraction(int x,int y)
	{
		int result=(x-y);
		System.out.println("Subtraction Result:"+result);
	}

}
class Example3 extends Example2
{
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("Multiplication Result:"+result);
	}

}
class Example4 extends Example
{
	void division(int a,int b)
	{
		int res=(a/b);
		System.out.println("Division Result:"+res);
	}

}

public class HybridInheritance {

	public static void main(String[] args) {
		Example3 obj1=new Example3();
		obj1.addition(10, 30);
		obj1.subtraction(29, 4);
		obj1.multiplication(9, 8);
		Example4 obj2=new Example4();
		obj2.addition(63,8);
		obj2.division(35, 5);



	}

}
