package com.mkpits.operators;

public class PostIncrementDecrementOperator 
{

	public static void main(String[] args)
	{
		// in post increment and decrement operator firstly assign value has used and after update into memory
		
		int number=98;
		System.out.println(number); //98  m-98
		System.out.println(number++); //98 m-99
		System.out.println(number);//99
		System.out.println(number++);//99 m-100
		System.out.println(number++);//100 m-101
		System.out.println(++number);//102 m-102
		System.out.println(number++);//102 m-102
		System.out.println(++number);//104 m-104
		System.out.println(number++);//104 m-105
		System.out.println(number);//105
	}

}
