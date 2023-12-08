package com.mkpits.scopeofvariable;

public class StaticVarClass {
	
	static long phoneNum = 123456789;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static variable start with the word static
		//static keyword is accessible throughout the class anywhere
		//if there is static variable and local variable with same name then the call or preference will be given
		//to  local variablle
     
		System.out.println("Your phone Number is :" +phoneNum);
	}

}
