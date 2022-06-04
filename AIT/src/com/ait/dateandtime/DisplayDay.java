package com.ait.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDay {

	public static void main(String[] args) {
		LocalDateTime obj1=LocalDateTime.now();
		System.out.println(obj1);
		
DateTimeFormatter obj2=DateTimeFormatter.ofPattern("E, MMM DD YYYY HH:MM:SS");
String s=obj1.format(obj2);
System.out.println(s);


	}

}
