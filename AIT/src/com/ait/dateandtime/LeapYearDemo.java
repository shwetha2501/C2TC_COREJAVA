package com.ait.dateandtime;

import java.time.LocalDate;

public class LeapYearDemo {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.of(2020,1,13);
		System.out.println(date1.isLeapYear());
		
		LocalDate date2 = LocalDate.of(2028,9,23);
		System.out.println(date2.isLeapYear());
        
		LocalDate date3 = LocalDate.of(2024,8,20);
		System.out.println(date3.isLeapYear());
		
		LocalDate date4 = LocalDate.of(2022,6,04);
		System.out.println(date4.isLeapYear());
	}
	}


