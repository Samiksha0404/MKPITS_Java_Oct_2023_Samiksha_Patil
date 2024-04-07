package com.mkpits.methodoverriding;

public class RectangleClass 
{
	double width,height;
	void getData(double d, double e)
	{
		this.width=d;
		this.height=e;
	}
	
	// parent class method
	
	// method overriding is having same signature in parent and child class 
	double area()
	{
		return width*height;
	}
}
