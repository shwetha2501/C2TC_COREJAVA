package com.C2TC.Knowledgecheck;

public class Test {

	public static void main(String[] args) {
		Test obj=new Test();
		obj.start();
	}
	void start()
	{
		String stra="do";
		String strb=method(stra);
				System.out.print(":" +stra+strb);
	}
	String method(String stra)
	{
		stra=stra+"good";
		System.out.print(stra);
		return "good";
		
		

	}

}

