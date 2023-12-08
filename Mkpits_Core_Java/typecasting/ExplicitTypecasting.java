package com.mkpits.typecasting;

public class ExplicitTypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitTypecasting o = new ExplicitTypecasting();
		
		
		
		short a=20, b=30;

		byte c = (byte)(a+ b);// always adding datatype in brackets to convert any data type manually
		// manually conversion of datatype is called explicit type casting
		// a+b must be in the brackets other wise it shows error
		// in explicit typecasting we can change the datatype manually into any smaller or larger datatype 
		//by just mentioning the data type infront of the variable
		System.out.println(c);

	}


}
