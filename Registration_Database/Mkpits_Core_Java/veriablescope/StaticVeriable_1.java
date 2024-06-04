package com.mkpits.veriablescope;

public class StaticVeriable_1 {
	
	static long phoneNumber=7875475764l;

	public static void main(String[] args) {
		
		// static variable calling 2nd way 
		// we can call static variable using class name through out same class or packeges 
		// we can use same variable name in another class but when we calling we must use class name or object or instance
		
		
		
		System.out.println(phoneNumber);
		System.out.println(StaticVariableClass.phoneNumber);

	}
	
	

}
