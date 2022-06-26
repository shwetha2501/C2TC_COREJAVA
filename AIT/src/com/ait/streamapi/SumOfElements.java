package com.ait.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//reduce(0,(c,e)  first we are initializing the c value is 0 and for next time 
		//c will take the value of previous output it is like how in normal program we are intializing
		//int result=0;
		System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->(c+e)));
       System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
       System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
	}

}
