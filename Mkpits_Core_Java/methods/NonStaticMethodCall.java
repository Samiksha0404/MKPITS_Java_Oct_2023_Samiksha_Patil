package com.mkpits.methods;

public class NonStaticMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethodWithReturnType ns=new NonStaticMethodWithReturnType();
		System.out.println("Email :-"+ns.getEmail());
		System.out.println("Password :-"+ns.getPassword());
	}

}
