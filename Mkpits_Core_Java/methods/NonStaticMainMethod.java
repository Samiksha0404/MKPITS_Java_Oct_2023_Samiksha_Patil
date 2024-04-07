package com.mkpits.methods;

public class NonStaticMainMethod {

	public static void main(String[] args) {
		
		NonStaticMethodWithReturnType nsm= new NonStaticMethodWithReturnType();
		System.out.println("Name :- "+nsm.getName());
		System.out.println("Mobile No. :- "+nsm.getMobile());
		System.out.println("Email :- "+nsm.getEmail());
		System.out.println("Password :- "+nsm.getPassword());
		System.out.println();

	}

}
