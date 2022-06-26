package com.ait.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindFirstDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,46,68);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst()); 
		//findfirst() it will print output of the first result;
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(99));
		//orElse() in the value assigned if there is no value available divisible by 5 means it will print 
		//the value what ever we are passed in the orElse(0) method so we can pass any number here
	}

}
