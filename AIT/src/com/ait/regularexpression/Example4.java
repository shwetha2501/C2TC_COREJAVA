package com.ait.regularexpression;

import java.util.regex.Pattern;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("? quantifier....");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?",""));
		System.out.println(Pattern.matches("[amn]?","m"));
		System.out.println(Pattern.matches("[amn]?","n"));
		System.out.println(Pattern.matches("[amn]+",""));
		System.out.println(Pattern.matches("[amn]+","aaammmmmmnnnnnn"));
		System.out.println(Pattern.matches("[amn]*",""));
		System.out.println(Pattern.matches("[amn]{2}","a"));
		System.out.println(Pattern.matches("[amn]{2}","aa"));
		System.out.println(Pattern.matches("[amn]{2,}","a"));
		System.out.println(Pattern.matches("[amn]{2,}","aaa"));
		System.out.println(Pattern.matches("[bsn]{4,9}", "ssss"));
		System.out.println(Pattern.matches("[bsn]{4,9}", "sssssssss"));
		System.out.println(Pattern.matches("[bsn]{4,9}", "ssssssssss"));
		System.out.println(Pattern.matches("[bsn]{4,9}", "ss"));

	}

}
