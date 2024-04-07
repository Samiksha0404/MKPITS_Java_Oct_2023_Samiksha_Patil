package com.mkpits.constructor;

public class ConstructorOverloading 
{

	public ConstructorOverloading() 
	{
		System.out.println("No Argunment Constructor...");
	}
	
	public ConstructorOverloading(int a , int b ) 
	{
		
		System.out.println("Parameterized constructor....");
	}
	public ConstructorOverloading(ConstructorOverloading o)
	{
		System.out.println("Object ");
	}
	public static void main(String[] args) 
	{
		//ConstructorOverloading co=new ConstructorOverloading();
		ConstructorOverloading co1=new ConstructorOverloading(5,6);
		ConstructorOverloading co2=new ConstructorOverloading(co1);
		
	}

}
