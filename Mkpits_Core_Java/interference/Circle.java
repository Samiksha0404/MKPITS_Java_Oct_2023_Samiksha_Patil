package com.mkpits.interference;

public class Circle extends Shape {

	double radius;
	
	public Circle(String color, double radius) {
		
		//calling shape constructor
		super(color);
		System.out.println("Circle constructor is called ");
		this.radius =radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+ super.getColor()+"and area is: "+area();
	}

}
