package com.ait.exception;

final abstract class Dress1
{
	abstract void type();
}
class menswear extends Dress
{
	void type()
	{
		System.out.println("It's a Mens wear");
	}
}

public class Dresess {

	public static void main(String[] args) {
		menswear coat=new menswear();
		coat.type();
	}

}
