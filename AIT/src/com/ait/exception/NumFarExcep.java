package com.ait.exception;

public class NumFarExcep {

	public static void main(String[] args) {
		String[] s = {"Hello", "423", null, "Hi"};
		for (int i = 0; i < 5; i++)
		{
			try
			{
				int a = s[i].length() + Integer.parseInt(s[i]); 
				System.out.println(a);
			}
			catch(NumberFormatException ex)
			{

				System.out.println("NumberFormatException");
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}

			System.out.println("Continuing.. ");
		}

	}

}
