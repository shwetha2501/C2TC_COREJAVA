package com.ait.thiskeyword;

public class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}

	public static void main(String[] args) {
		Student s1=new Student(87,"Sachin",45000f);
		Student s2=new Student(77,"Nithu",60000f);
		s1.display();
		s2.display();


	}

}
