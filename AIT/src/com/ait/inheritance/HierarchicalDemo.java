package com.ait.inheritance;


class Maths
{
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result:" +result);
	}
}
class Maths1 extends Maths
{
	void subtraction(int x,int y)
	{
		int result=(x-y);
		System.out.println("Subtraction Result:"+result);
	}
}
class BasicMaths2 extends Maths
{
	void multiplication(int x,int y)
	{
		int result=(x*y);
		System.out.println("Multiplication Result:"+result);
	}
}


public class HierarchicalDemo {

	public static void main(String[] args) {
		Maths1 obj1=new Maths1();
		BasicMaths2 obj2=new BasicMaths2();
		obj1.addition(20,30);
		obj1.subtraction(56,7);
		obj2.addition(100,10);
		obj2.multiplication(12, 5);


	}

}
