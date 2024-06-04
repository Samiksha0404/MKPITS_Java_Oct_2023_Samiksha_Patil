package com.mkpits.interference;

public class AbstractClassCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Circle("Blue",4.1);
		Shape s2 = new Rectangle("Green", 3.4 , 4.9);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
