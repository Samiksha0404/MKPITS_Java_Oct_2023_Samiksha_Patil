package com.mkpits.interfaces;

// implements is a keyword used to extend interface into the class
public class Rectangle implements Shape {
	
	double length,breath;
	
	// it is a constructor 
	public Rectangle(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}


	@Override
	// override method 
	public double getArea() {
		
		return length*breath;
	}

}
