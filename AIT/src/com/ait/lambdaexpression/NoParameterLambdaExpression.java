package com.ait.lambdaexpression;



interface Sayable
{
	public void Say();
}

public class NoParameterLambdaExpression {

	public static void main(String[] args) {
		Sayable s=()->
		{
			System.out.println("I have nothing to Say");
		};
		s.Say();
        

	}

}
