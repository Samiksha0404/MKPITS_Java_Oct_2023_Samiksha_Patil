package com.mkpits.scopeofvariable;

public class StaticVar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//third way to call variable is by creating object
		// we can call static variable by creating object or directly through instance
		// another way we can call a variable by creating its instance
   
		StaticVarClass  sc = new StaticVarClass();
		System.out.println(sc.phoneNum);
		System.out.println(StaticVarClass.phoneNum);
	}

}
