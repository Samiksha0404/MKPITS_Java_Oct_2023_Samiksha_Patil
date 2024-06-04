package com.mkpits.methods;

public class StaticMethodCallingByClassName {
	
	public static void getMobile() {
		
		System.out.println(9834826072l);
		
	}
	
	public static void getEmail()
	{
		System.out.println("ashikt128@gmail.com");
	}

	public static void main(String[] args) {
		
		System.out.print("First Name :- ");
		StaticMethodCallingDirectly.getFirstName();
		System.out.print("Last Name :- ");
		StaticMethodCallingDirectly.getLastName();
		System.out.print("Mobile No. :- ");
		getEmail();
		System.out.print("Email :-");
		getMobile();

	}

}
