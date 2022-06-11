package com.ait.exception;

import java.io.FileInputStream;

public class MyClass4 {
	public void checkFileNotFound()
	{
		try
		{
			FileInputStream in=new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch(Exception fileNotFoundException)
		{
			System.out.println(fileNotFoundException+"file not found exception");
		}
	}

	public static void main(String[] args) {
		MyClass4 example=new MyClass4();
		example.checkFileNotFound();
		
		

	}

}
