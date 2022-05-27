package com.capgemini.practiceassignment;

import java.util.Scanner;

public class EnterTheValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
				System.out.println(ch++);
			System.out.println();
		}

	}

}
