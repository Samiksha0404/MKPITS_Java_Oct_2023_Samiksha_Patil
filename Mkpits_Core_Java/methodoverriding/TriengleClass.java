package com.mkpits.methodoverriding;

public class TriengleClass extends RectangleClass 
{
	// override  the parent class method in child class
	double area()
	{
		return (width*height)/2;
	}
}
