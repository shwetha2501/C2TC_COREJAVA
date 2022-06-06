package com.ait.polymorphism;
abstract class Animal
{  
	abstract void eat();
	{
		System.out.println("Animals Eat");
	}  
}  
class herbivores extends Animal
{  
	void eat()
	{
		System.out.println("Herbivores Eat Plants");
	} 
}
class omnivores extends Animal
{  
	void eat()
	{
		System.out.println("Omnivores Eat Plants and meat");
	} 
}
class carnivores extends Animal
{  
	void eat()
	{
		System.out.println("Carnivores Eat meat");
	} 
}
public class poly1
{
	public static void main(String args[])
	{ 
		Animal A = null;
		Animal h = new herbivores();  
		Animal o = new omnivores(); 
		Animal c = new carnivores(); 
		A=h;
		A=o;
		A=c;
		
		h.eat();
		o.eat();  
		c.eat();  

	}  
}  

