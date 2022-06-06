package com.ait.inheritance;
class Sample
{
	void addition(int a,int b)
	{
		int res=(a+b);
		System.out.println(res);
				
	}
}
class Sample1 extends Sample
{
	void subtraction(int a,int b)
	{
		int res=(a-b);
		System.out.println(res);
	}
}
class Sample2 extends Sample1

public class MultilevelDemo {

	public static void main(String[] args) {
		Sample a=new Sample();
		a.addition(10, 5);
		

	}

}
