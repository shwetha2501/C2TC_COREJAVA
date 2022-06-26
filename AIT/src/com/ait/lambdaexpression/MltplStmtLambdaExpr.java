package com.ait.lambdaexpression;


interface Sayable1
{
	public void Say();

}
public class MltplStmtLambdaExpr {

	public static void main(String[] args) {
		Sayable1 s=()->
		{
			System.out.println("I have nothing to say");
			System.out.println("I have nothing to say");
			System.out.println("I have nothing to say");
		};
		s.Say();
	


	}

}
