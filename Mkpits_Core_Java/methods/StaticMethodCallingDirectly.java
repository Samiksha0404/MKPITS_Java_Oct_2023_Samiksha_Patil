package com.mkpits.methods;

public class StaticMethodCallingDirectly {

	
	public static void getFirstName()
	{
		System.out.println("Ashik");
	}
	
	public static void getLastName()
	{
		System.out.println("Tembhare");
	}
	
	public static void main(String[] args) {
		
		System.out.print("First Name :- ");
		getFirstName();
		System.out.print("Last Name :- ");
		getLastName();
		
		
	}

}
