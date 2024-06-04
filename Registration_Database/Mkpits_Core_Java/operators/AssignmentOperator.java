package com.mkpits.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		// assignment operator assign value to left side variable 
		// assignment operator are binary operator 
		// there is one operator and two operand thats why it is binary operator
		
		int var1=10 , var2=50;
	    var1=var1+=var2; // var1=var1+var2
		System.out.println(var1); //60
		
		int result=15;
		System.out.println((result+=45)); // 60

	}

}
