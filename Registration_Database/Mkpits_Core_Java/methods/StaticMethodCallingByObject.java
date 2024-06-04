package com.mkpits.methods;

public class StaticMethodCallingByObject {
	
	public static void getGender()
	{
		System.out.println("Male");
	}
	
	public static void getPasword1()
	{
		System.out.println("Password");
	}

	public static void main(String[] args) {
		
		StaticMethodCallingDirectly smd= new StaticMethodCallingDirectly();
		System.out.println("First Name :- ");
		smd.getFirstName();
		System.out.println("Last Name :- ");
		smd.getLastName();
		
		StaticMethodCallingByClassName smc=new StaticMethodCallingByClassName();
		System.out.println("Mobile No. :- ");
		smc.getMobile();
		System.out.println("Email :- ");
		smc.getEmail();
		
		StaticMethodCallingByObject smo=new StaticMethodCallingByObject();
		System.out.println("Gender :- ");
		smo.getGender();
		System.out.println("Password :- ");
		smo.getPasword1();
		

	}

}
