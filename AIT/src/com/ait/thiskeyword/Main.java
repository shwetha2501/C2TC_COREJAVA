package com.ait.thiskeyword;

class Smile
{
	void Sad(Smile star)
	{
		System.out.println("Method is invoked");
	}
	void Happy()
	{
		Sad(this);
	}
}

public class Main {

	public static void main(String[] args) {
		Smile s=new Smile();
		s.Happy();

	}

}
