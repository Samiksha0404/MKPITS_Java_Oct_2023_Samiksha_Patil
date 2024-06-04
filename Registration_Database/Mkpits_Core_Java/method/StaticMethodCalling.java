package com.mkpits.method;

public class StaticMethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//second way of calling using class name/reference
      StaticMethodDec.getAllData();
      
      //third way of calling a static method is by creating an object
      StaticMethodDec Method = new  StaticMethodDec();
      Method.getEmail();
      
      // instance of class
      new  StaticMethodDec().getFirstName();
      new  StaticMethodDec().getLasttName();
	}

}
