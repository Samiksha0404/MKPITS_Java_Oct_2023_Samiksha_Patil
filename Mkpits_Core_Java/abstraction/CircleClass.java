package com.mkpits.abstraction;

public class CircleClass extends ShapeClass
{

	double redius;
	public CircleClass(String color, double redius) 
	{
		super(color);
		this.redius=redius;
	}

	@Override
	public double area() 
	{
		return Math.PI*Math.pow(redius, 2);
	}

	@Override
	public String toString() 
	{
		return "The Color of the Circle is "+super.color+" and The Area is "+area();
	}

}
