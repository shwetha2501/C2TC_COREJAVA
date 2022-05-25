package com.C2TC.Knowledgecheck;

public class Sample {
	int weight;

}
class Main{
	public static void main (String args[])
	{
		Sample a1=new Sample();
		Sample a2=new Sample();
		a1.weight=12;
		a2.weight=10;
		a2=a1;
		System.out.println(a2.weight);
		
	}
}