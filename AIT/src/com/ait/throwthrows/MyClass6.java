package com.ait.throwthrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListTooLargeException extends RuntimeException 
{
	ListTooLargeException(String message) 
	{
		System.out.print(message); 
	}
}
public class MyClass6 
{
	public void analyze(List<String>data) 
	{
		if (data.size() > 50) 
		{
			throw new ListTooLargeException("List can't exceed 50 items!");
		} 
	}

	public static void main(String[] args) 
	{
		MyClass6 obj = new MyClass6();
		List<String> data = new ArrayList<>(Collections.nCopies(100,"Customer Details"));
		obj.analyze(data);
	}
}

