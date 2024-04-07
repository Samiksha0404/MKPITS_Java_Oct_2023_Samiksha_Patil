package com.mkpits.operators;

public class PreIncrementDecrementOperator 
{

	public static void main(String[] args) 
	{
		
		// pre increment(++) and decrement(--) operators 
		// operator is a special symbol used to perform specific task 
		
		// pre increment operator increases value by 1 
		// it firstly increases value then after saved in memory 
		
		// it is unary operator , cz there is only one operand and one operator 
		
		int num1=10;
		// here value increases by one and assign simultaneously
		System.out.println(++num1);  // 11
		
		int num2=100;
		System.out.println(--num2); // 9
	}

}
