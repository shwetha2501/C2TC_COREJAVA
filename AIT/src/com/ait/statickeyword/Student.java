package com.ait.statickeyword;

public class Student {
	int rollno;
	String name;
	static String college="ITS";

	Student(int r, String n) {

		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno+ " "+name+" "+college);
	}
	public static void main(String[] args) {
		Student s1=new Student(92,"Shwetha");
		Student s2=new Student(25,"Santhosh");
		s1.display();
		s2.display();
	}
}





