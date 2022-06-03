package com.ait.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		//1st way
		Pattern p=Pattern.compile(".weta");
		Matcher m=p.matcher("sweta");
		boolean b1=m.matches();

		//2nd way
		boolean b2=Pattern.compile(".weta").matcher("sweta").matches();

		//3rd way
		boolean b3=Pattern.matches(".weta", "sweta");
		System.out.println(b1+" "+b2+" "+b3);

	}

}
