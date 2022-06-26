package com.ait.lambdaexpression;


interface addition
{
	public int add(int a,int b);
}

public class UsingArithmeticExpr {

	public static void main(String[] args) {
		addition c=(int a,int b)->(a+b);
		{
			System.out.println(c.add(50,50));
		};

	}

}
