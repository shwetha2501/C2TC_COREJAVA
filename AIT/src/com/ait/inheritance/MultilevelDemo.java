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
{
	void division(int a,int b)
	{
		int res=(a/b);
		System.out.println(res);
	}
}
class Sample3 extends Sample2
{
	void multiplication(int r,int n)
	{
		int res=(r*n);
		System.out.println(res);
	}
}

public class MultilevelDemo {

	public static void main(String[] args) {
		Sample3 a=new Sample3();
		a.addition(10, 5);
		a.subtraction(90, 20);
		a.division(12, 2);
		a.multiplication(15, 4);


	}

}
