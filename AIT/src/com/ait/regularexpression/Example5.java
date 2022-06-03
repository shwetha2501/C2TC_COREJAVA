package com.ait.regularexpression;

import java.util.regex.Pattern;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");
		System.out.println(Pattern.matches("\\d",""));
		System.out.println(Pattern.matches("\\d", "abc")); 
		 System.out.println(Pattern.matches("\\d", "1")); 
		 System.out.println(Pattern.matches("\\d", "10")); 
		 System.out.println(Pattern.matches("\\d", "4443")); 
		 System.out.println(Pattern.matches("\\d", "323abc"));
		 System.out.println(Pattern.matches("\\d", "0"));
		 System.out.println(Pattern.matches("\\d", "-1"));
		 System.out.println(Pattern.matches("\\d", "0123456789"));
		 System.out.println(Pattern.matches("\\d", "a"));

	}

}
