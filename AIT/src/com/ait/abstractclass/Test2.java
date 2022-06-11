package com.ait.abstractclass;

abstract class Shape
{
	abstract void draw();
}
class rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Shape s=new rectangle();
		s.draw();


	}

}
