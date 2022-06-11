package com.ait.exception;

public class Sample4 {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try
		{
			int z=x/y;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
