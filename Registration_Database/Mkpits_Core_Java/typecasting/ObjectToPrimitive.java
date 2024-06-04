package com.mkpits.typecasting;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interger.parseInt or any other datatype can only used to covert string type of data to other datatype
  String str = "23445";
  float newstr = Float.parseFloat(str);
  System.out.println(newstr);
  String order = "3456";
  short neworder = Short.parseShort(order);
  System.out.println(neworder);
  long neworder2 = Long.parseLong(order);
  System.out.println(neworder2);
	}

}
