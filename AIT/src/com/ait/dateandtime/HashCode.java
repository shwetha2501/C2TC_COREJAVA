package com.ait.dateandtime;

import java.util.Date;

public class HashCode {

	public static void main(String[] args) {
		Date mydate = new Date();
		System.out.println("System date:"+ mydate.toString());
		mydate.setTime(15680);
		System.out.println("Time after setting:"+ mydate.toString());
		int d = mydate.hashCode();
		System.out.println("Amount (in ms) by which time"+"is shifted:"+d);

	}

}
