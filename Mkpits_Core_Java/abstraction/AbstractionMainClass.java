package com.mkpits.abstraction;

public class AbstractionMainClass 
{
	public static void main(String[] args) 
	{
		ShapeClass s1=new RectangleClass("Red", 4.56, 55.6);
		ShapeClass s2=new CircleClass("Green", 2.5);
	//=========================================================//	
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
	
	// what is abstraction ?
	// abstraction is hiding the implementation and showing only functionality

}
