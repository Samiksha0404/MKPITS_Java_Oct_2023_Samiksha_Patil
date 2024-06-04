package com.mkpits.interfaces;

public class ClassMain {

	public static void main(String[] args) {
		
		Shape area;
		area=new Circle(52);
		System.out.println("The area of the Circle :-"+area.getArea()+"\n");
		area=new Rectangle(45.25, 45.22);
		System.out.println("The area of the Rectangle :-"+area.getArea());
		
		Triengle areat=new Triengle();
		areat.setLength(15);
		areat.setBreath(458.45);
		
		System.out.println("The area of the Triangle :- "+areat.getArea());
		

	}

}
