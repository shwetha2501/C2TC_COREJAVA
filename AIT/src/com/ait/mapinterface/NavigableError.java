package com.ait.mapinterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableError {

	public static void main(String[] args) {
		SortedMap<Integer,String> httpcode=new TreeMap<Integer,String>();
//the methods firstEntry() and lastEntry does not belongs to Sorted map it is of Navigable map
		httpcode.put(103,"May");

		httpcode.put(100,"the");

		httpcode.put(102,"Fourth");

		httpcode.put(200,"be with");

		httpcode.put(205,"you");

		System.out.println(httpcode);

		System.out.println(httpcode.firstEntry());

		System.out.println(httpcode.lastEntry());
	}

}
