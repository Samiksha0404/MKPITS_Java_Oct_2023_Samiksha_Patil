package com.mkpits.interference;

public  abstract class Shape {
// abstract keyword is used in abstract class
	
	String color;
	
	public abstract double area();
	//these are abstract methods
	
	public abstract String toString();
	
	
	//abstract class can have the constructor
	public Shape(String color) {
		System.out.println("Shape Constructor is called ");
		this.color = color;
	}
	
	
	
	//this is a concrete method
	//Concrete methods are methods that are declared in an abstract class and are implemented in the subclass.
	//They define a set of operations that can be performed on any object of the subclass.

	public String getColor() {
		return color;
	}
}
