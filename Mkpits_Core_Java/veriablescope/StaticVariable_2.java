package com.mkpits.veriablescope;

public class StaticVariable_2 {

	public static void main(String[] args) {
		
		// 3rd way to call static variable
		
		// we call static variable by creating a object or directly through instance
		// static variable must declare below class declaration and above method declaration 
		// and we must initialize that variable as per their data type 
		
		StaticVariableClass sv=new StaticVariableClass();
		System.out.println(sv.phoneNumber);
		
		// there is another way without creating object we can access that varible by creating instance 
		
		System.out.println(new StaticVariableClass().phoneNumber);
		
		
		

	}  

}
