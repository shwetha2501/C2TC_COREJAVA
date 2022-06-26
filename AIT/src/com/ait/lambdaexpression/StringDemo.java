package com.ait.lambdaexpression;




interface ConcatStng
{
	public String cnt(String a,String b);
}

public class StringDemo {

	public static void main(String[] args) {
		ConcatStng c=(String a,String b)->(a+b);
		{
			System.out.println(c.cnt("50","50"));
		};

	}

}
