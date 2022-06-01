package com.ait.stringinbuiltmethod;

public class IndexOfDemo {

	public static void main(String[] args) {
		String s1="This is the world";
		int index1=s1.indexOf('s');
		System.out.println(index1);
		int index2=s1.indexOf("is");
		int index3=s1.indexOf("world");
		System.out.println(index2);
		System.out.println(index3);
		int index4=s1.indexOf("the",7);
		System.out.println(index4);
				

	}

}
