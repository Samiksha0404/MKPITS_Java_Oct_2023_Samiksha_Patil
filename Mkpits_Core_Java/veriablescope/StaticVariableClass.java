package com.mkpits.veriablescope;

public class StaticVariableClass {
	
	public static long phoneNumber=8806335450L; //public - accessible for all the area i.e 

	public static void main(String[] args) {
		
		// static variable 
		//static variable start with "static" keyword
		//the accessibility of static keyword is through out the class anywhere 
		// we can use static variable in three ways 
		// direct....
		//  long phoneNumber=9834826072l;
		// if there is a local variable with same name as static variable then the 
		// preference goes to local variable....
		
		System.out.println("My Phone Number is :- "+phoneNumber);

	}

}
