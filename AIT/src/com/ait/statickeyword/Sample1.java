package com.ait.statickeyword;

public class Sample1 {
	int rollno;
	String name;
	static String college;
	static
	{
		college="BMS";
	}
	Sample1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="AIT";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Sample1 s1=new Sample1(52,"Shravani");
		Sample1 s2=new Sample1(36,"Sunil");
		change();
		s1.display();
		s2.display();



	}

}
