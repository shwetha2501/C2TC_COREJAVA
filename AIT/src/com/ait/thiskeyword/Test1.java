package com.ait.thiskeyword;

class Sample1
{
	Sample1()
	{
		System.out.println("HELLO this keyword");
	}
	Sample1(int x)
	{
		this();
		System.out.println(x);
	}

}
public class Test1 {

	public static void main(String[] args) {
		Sample1 d=new Sample1(10);


	}

}
