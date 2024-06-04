package com.mkpits.abstraction;

public abstract class ShapeClass 
{
	String color;
	// super class constructor 
	public ShapeClass(String color) 
	{
		this.color=color;
	}
	
	public abstract double area();     // abstract class 
	public abstract String toString(); // abstract class
	
	// Concrete method
	public String getColor()
	{
		return color;
	}
	
	
}
