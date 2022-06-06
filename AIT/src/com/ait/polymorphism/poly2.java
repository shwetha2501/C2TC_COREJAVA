package com.ait.polymorphism;
abstract class Hillstations
{  
	abstract void location();
	abstract void famousfor();
}  
class Manali extends Hillstations 
{  
	void location()
	{
		System.out.println("Manali is in Himachal Pradesh");
	}  
	void famousfor()
	{
		System.out.println("It is Famous for Hadimba Temple and adventure sports");
	}  
}
class Mussoorie extends Hillstations 
{  
	void location()
	{
		System.out.println("Mussoorie is in Uttarakhand");
	}  
	void famousfor()
	{
		System.out.println("It is Famous for education institutions");
	}  
}
class Gulmarg extends Hillstations
{  
	void location()
	{
		System.out.println("Gulmarg is in J&amp;K");
	}  
	void famousfor()
	{
		System.out.println("It is Famous for skiing");
	}  
}
public class poly2
{
	public static void main(String args[]){ 
		Hillstations hill=null;
		Hillstations M = new Manali();

		Hillstations Mu = new Mussoorie();

		Hillstations G = new Gulmarg();

		hill=M;
		hill=Mu;
		hill=G;

		M.location();
		M.famousfor();

		Mu.location();
		Mu.famousfor();

		G.location();
		G.famousfor();
	}  
}  

