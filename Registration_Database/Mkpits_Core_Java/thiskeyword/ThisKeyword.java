package com.mkpits.thiskeyword;

public class ThisKeyword 
{
	float pi;
	String trainerName;
	
	public ThisKeyword(float pi) 
	{
		 this.pi=pi;
	}
	public static void main(String[] args) 
	{
		ThisKeyword tk=new ThisKeyword(3.14f);
		System.out.println("The value of pi is :-"+tk.pi);
		tk.getName("Super Man Shrikant Sir");
		System.out.println("My trainer Name is :- "+tk.trainerName);

	}
	private void getName(String trainerName) 
	{
		this.trainerName=trainerName;
	}
	
	// this is keyword in java 
	// "this" is used to refer current class object 
	// when there is local variable and class variable in the class then to refer that variable we are using this keyword
	// 
	
}
