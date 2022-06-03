package com.ait.regularexpression;

import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {


		System.out.println(Pattern.matches(".s","yes"));
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches("..s", "has"));
		System.out.println(Pattern.matches(".s", "ammas"));
		System.out.println(Pattern.matches("...s", "mass"));

	}

}
