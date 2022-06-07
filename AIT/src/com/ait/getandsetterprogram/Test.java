package com.ait.getandsetterprogram;

abstract class Movie
{
	String Title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return Title;
	}
}
class MyMovie extends Movie
{
	void setTitle(String s)
	{
		Title=s;
	}

}


public class Test {
	public static void main(String args[])
	{
		Movie MyBook=new MyMovie();
		MyBook.setTitle("RRR");
		System.out.println("Movie name is:"+MyBook.getTitle());
		MyBook.setTitle("KGF");
		System.out.println("Movie name is:"+MyBook.getTitle());
	}

}
