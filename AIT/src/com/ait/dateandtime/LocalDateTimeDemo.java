package com.ait.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDate obj1=LocalDate.now();
		LocalTime obj2=LocalTime.now();
		LocalDateTime obj3=LocalDateTime.now();
		
		System.out.println("Execution Date:"+obj1);
		System.out.println("Execution Time:"+obj2);
		System.out.println("Execution Date and Time:"+obj3);

	}

}
