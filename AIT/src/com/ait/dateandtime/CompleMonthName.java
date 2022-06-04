package com.ait.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompleMonthName {

	public static void main(String[] args) {
		LocalDateTime obj1=LocalDateTime.now();
		System.out.println(obj1);
		
DateTimeFormatter obj2=DateTimeFormatter.ofPattern("DD/MMMM/YYYY HH:MM:SS");
String s=obj1.format(obj2);
System.out.println(s);


	}

}
