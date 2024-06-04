package com.mkpits.interference;

public class Rectangle extends Shape {

	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		// calling shape constructor
		super(color);
		System.out.println("Rectngle constructor called ");
		this.length = length;
		this.width = width;
	}	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is "+super.getColor()+"and area is : "+area();
	}

}
