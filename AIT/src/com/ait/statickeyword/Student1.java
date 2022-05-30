package com.ait.statickeyword;

public class Student1 {
	int rollno;
	String name;
	static String college="ITS";
	
	Student1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	static void change()
	{
		college="Atria";
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(78,"Shilpa");
		Student1 s2=new Student1(62,"Kashi");
		change();
		s1.display();
		s2.display();
	}
		
	}
	
		
		
		

	


