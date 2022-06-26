package com.ait.inheritance;

interface Drawable
{
	public void draw(int radius);
}

public class ParameterLmdaExpr {

	public static void main(String[] args) {
		Drawable d=(int radius)->
		{
			System.out.println("Draw a cube with width and lenth"+ " "+radius);
		};
		d.draw(10);

	}

}
