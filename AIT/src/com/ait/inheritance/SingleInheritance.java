package com.ait.inheritance;


class BasicMaths
{
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("Addition Result:"+result);
	}
}
class BasicMaths1 extends BasicMaths
{
	void subtraction(int x,int y)
	{
		int result=(x-y);
		System.out.println("Substraction Result:"+result);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		BasicMaths1 obj=new BasicMaths1();
		obj.addition(78,2);
		obj.subtraction(25,5);



	}

}
