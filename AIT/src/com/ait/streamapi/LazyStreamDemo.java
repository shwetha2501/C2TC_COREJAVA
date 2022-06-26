package com.ait.streamapi;

import java.util.Arrays;
import java.util.List;

public class LazyStreamDemo {
	public static boolean isdivisible(int i)
	{
		System.out.println("indivisible" +i);
		return i%5==0;


	}
	public static int mapdouble(int i)
	{
		System.out.println("inmapdouble"+i);
		return i*2;
	}

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(list.stream().filter(LazyStreamDemo :: isdivisible).map(LazyStreamDemo::mapdouble).findFirst().orElse(0));



	}

}
