package com.ait.stringinbuiltmethod;

public class FormatDemo {

	public static void main(String[] args) {
		String name="CSK";
		String f1=String.format("%s",name);
		String f2=String.format("%f",32.33434);
		String f3=String.format("%16.12f",32.33434);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}
