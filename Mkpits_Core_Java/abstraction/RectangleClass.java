package com.mkpits.abstraction;

public class RectangleClass extends ShapeClass
{
	double length,breath;
	public RectangleClass(String color, double length, double breath) 
	{
		super(color);
		this.length=length;
		this.breath=breath;
	}

	@Override
	public double area() 
	{
		return length*breath;
	}

	@Override
	public String toString() 
	{
		return "Color of the Rectangle "+super.color+" and Area of the Rectangle "+area();
	}
	



}
