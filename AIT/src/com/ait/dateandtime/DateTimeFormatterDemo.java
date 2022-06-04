package com.ait.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {

		LocalDateTime d1= LocalDateTime.now();
		System.out.println("Before formatting: " +d1);

		DateTimeFormatter d2= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String d3= d1.format(d2);
		System.out.println("After formatting: " +d3);
	}
}





