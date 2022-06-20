package com.ait.collectionlistinterface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(22);
		int value = arrlist.size();
		System.out.println(value);
	}

}
