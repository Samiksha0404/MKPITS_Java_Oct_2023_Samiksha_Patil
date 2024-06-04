package com.mkpits.typecasting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=20, b=30;
	// 	byte c = a + b; :----------------this is mismatched byte a and  byte b sum cannot be saVED IN BYTE C 
		// it can only saved in the higher value  datatype
		// smaller datatype can only be converted into larger or bigger data type
		//byte---->short------>int------> long--->float--->double:--widening
		int c = a+ b;
		System.out.println(c);
		short n1=23,n2=33;
		int add = n1+n2;
		System.out.println(add);

	}

}
