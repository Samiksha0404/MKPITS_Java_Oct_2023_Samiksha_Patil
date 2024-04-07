package com.mkpits.interfaces;

public class Circle implements Shape {
	
	double redius;
	

	public Circle(double redius) {
		super(); // it called super class constructor
		this.redius = redius;
	}


	@Override
	public double getArea() {
		return 3.14*redius*redius;
	}

}
