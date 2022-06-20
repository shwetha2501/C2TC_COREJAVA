package com.ait.throwthrows;

import java.io.IOException;

class MyMethod
{
	void myMethod(int num)throws Exception{
		if(num==1)
			throw new IOException("IOException occured");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}
public class MyClass3 {
	public static void main(String[] args) {
		try
		{ 
			MyMethod obj=new MyMethod();
			obj.myMethod(1);

		}catch(Exception ex)
		{
			System.out.println(ex);
		}


	}

}
