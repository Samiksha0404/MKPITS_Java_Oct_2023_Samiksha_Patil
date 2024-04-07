package com.mkpits.constructor;

public class ThisMethod 
{

	int a,b;
	public ThisMethod() 
	{
		System.out.println("This is No Argunment ...");
	}
	public ThisMethod(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) 
	{
		ThisMethod th=new ThisMethod();
	}
	
	void smjha()
	{
		System.out.println(a);
	}

}
