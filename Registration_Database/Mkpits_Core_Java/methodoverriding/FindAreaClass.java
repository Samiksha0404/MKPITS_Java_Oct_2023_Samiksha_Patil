package com.mkpits.methodoverriding;

public class FindAreaClass {

	public static void main(String[] args) 
	{
		
		// upcasting 
		
//		RectangleClass obj;
//		obj=new RectangleClass();
//		obj.getData(1000.5, 1458.5);
//		System.out.println("Area of Rectangle :"+obj.area());
//		
//		obj=new TriengleClass();
//		obj.getData(101.23, 10.25);
//		System.out.println("Area of Triengle : "+obj.area());
		
		// downcasting
//		RectangleClass obj=new RectangleClass();
//		TriengleClass obj1=(TriengleClass) obj;
		// System.out.println(obj.area());
		
		System.out.println(new TriengleClass().area());
		

	}

}
