package com.capgemini.practiceassignment;

public class BreakWhileLoop {
	public static void main (String args[])
	{
		int a=1;
		while(a<=10)
		{
			if(a==5)
				break;
			System.out.println("\n\tStatement:" +a);
			a++;
		}
		System.out.println("\n\t End of Program.");
	}

}
