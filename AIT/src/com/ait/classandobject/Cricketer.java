package com.ait.classandobject;

class Cricketer {
	String name="Dhoni";
	int age=39;
	String color="Brown";
	String role="Batsman";
	String nationality="Indian";


	void display() { 
		System.out.println("I love crickete");

	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Cricketer c=new Cricketer();
		c.display();
		System.out.println("main method ended");

	}

}
