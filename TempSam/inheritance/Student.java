package com.mkpits.inheritance;

public class Student {

	int roll;
	String name;
	
	protected void getInfo(int roll, String name) {
		this.roll = roll;
		this.name = name;
		
	}
	protected void getName() {
		System.out.println("Name : "+name +"\nRoll No : "+roll);
	}
	  

	}




