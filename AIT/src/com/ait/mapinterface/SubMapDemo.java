package com.ait.mapinterface;

import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapDemo {

	public static void main(String[] args) {
		NavigableMap<Character,String> sd=new TreeMap<Character,String>();

		sd.put('b',"Barbie");

		sd.put('a',"Angel");

		sd.put('d',"Dora");

		sd.put('c',"Charlie");

		sd.put('e',"Emy");

		System.out.println(sd);  //it prints alphabetical order here

		System.out.println(sd.subMap('b','e'));//n-1 (e-1) from b to d it will print the value
	}

}
