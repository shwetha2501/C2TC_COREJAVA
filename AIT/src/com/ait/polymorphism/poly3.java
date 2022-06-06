package com.ait.polymorphism;
abstract class soundAnimal 
{ 
	abstract void Sound();
	{ 
		System.out.println("Different sounds of animal"); }
} 
class buffalo extends soundAnimal 
{ 
	 void Sound() 
	{ 
		System.out.println("The buffalo sound- gho,gho"); } 
} 
class snake extends soundAnimal 
{ 
	 void Sound() 
	{ 
		System.out.println("The snake sound- his,his"); } 
} 
class tiger extends soundAnimal
{ 
	void Sound() 
	{ 
		System.out.println("The tiger sounds- roooo, rooo"); } 
} 
public class poly3
{ 
	public static void main(String[] args) 
	{ 
		soundAnimal Animal = null;
		soundAnimal buffalo = new buffalo(); 
		soundAnimal snake = new snake(); 
		soundAnimal tiger = new tiger(); 
		Animal=buffalo;
		Animal=snake;
		Animal=tiger;
		
		Animal.Sound(); 
		buffalo.Sound();
		snake.Sound(); 
		tiger.Sound(); 
	} 
} 
