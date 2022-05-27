package com.capgemini.practiceassignment;

public class BreakAndForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Befor breaking=" +i);
			if(i==6)
				break;
			System.out.println("After Breaking=" +i);
		}
		System.out.println("For Loop terminated.");

	}

}
