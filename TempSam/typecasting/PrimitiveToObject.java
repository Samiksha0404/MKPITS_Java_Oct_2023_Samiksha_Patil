package com.mkpits.typecasting;

public class PrimitiveToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=127;  //primitive
		Integer i= new Integer(x); //object
		// it is deprecated
		System.out.println(i);
	
		float f=3.14f;  //primitive
		Double f1=new Double (f);  // wrapper class
		System.out.println(f1);
   
		 int str2 =234;
		 
		// String neew =  new String(str2);
		 
		 String neew =Integer.toString(str2);// conversion of int value to string
		 System.out.println(neew.getClass());//.getclass() can only be applicable on wrapper class

	}

}
