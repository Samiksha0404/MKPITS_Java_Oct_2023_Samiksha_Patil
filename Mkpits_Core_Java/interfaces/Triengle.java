package com.mkpits.interfaces;

public class Triengle implements Shape {
	
	double length,breath;
	
	

	// setter method used to initialized class variable 
	public void setLength(double length) {
		this.length = length;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	@Override
	public double getArea() {
		return 0.5*length*breath;
	}

}
