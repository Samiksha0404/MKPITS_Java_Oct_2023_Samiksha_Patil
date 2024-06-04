package com.mkpits.typecasting;

public class TypecastingPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =90;
		char ch=(char)number;//ch is taking the character which has 90 value i.e Z
		// we cannot convert any datatype to boolean datatype because boolean doesnot have memory to store
		System.out.println(number+" "+ch);
	
		int x=127;  //primitive
		Integer i= new Integer(x); //object
		System.out.println(i);
	}

}
