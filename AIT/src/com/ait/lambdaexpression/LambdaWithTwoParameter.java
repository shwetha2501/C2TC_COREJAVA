package com.ait.lambdaexpression;


interface Drawable
{
	public void draw(int radius ,int width);
}

public class LambdaWithTwoParameter {

	public static void main(String[] args) {
		
		Drawable d=(int radius,int width)->
		{
			System.out.println("Length and width"+width+" "+radius);
		};
		d.draw(10,20);
	}

}
