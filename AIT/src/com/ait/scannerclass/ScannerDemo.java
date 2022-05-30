package com.ait.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("Employee Name:" );
		String Name=sc.nextLine();
		System.out.println("Age:" );
		int age=sc.nextInt();
		System.out.println("Mobile Number:" );
		long mobileno=sc.nextLong();
		System.out.println("Department:" );
		String Department=sc.nextLine();
		System.out.println("Salary:");
		double salary=sc.nextDouble();
		System.out.println("Location:");
		String location=sc.nextLine();
		System.out.println("Designation :");
		String designation=sc.nextLine();
		System.out.println("Annual salary:");
		int ctc=sc.nextInt();

		System.out.println("Employee Name:" +Name);
		System.out.println("Age:" +age);
		System.out.println("Mobile Number:" +mobileno);
		System.out.println("Department:" +Department);
		System.out.println("Salary:"+salary);
		System.out.println("Location:"+location);
		System.out.println("Designation :"+designation);
		System.out.println("Annual salary:"+ctc);
		sc.close();
	}
}





