package com.ait.stringinbuiltmethod;

public class EqualsIgnoreCaseExample {

	public static void main(String[] args) {
		String s1="World largest City";
		String s2="World largest City";
		String s3="WORLD LARGEST CITY";
		String s4="The Smallest city";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

	}

}
