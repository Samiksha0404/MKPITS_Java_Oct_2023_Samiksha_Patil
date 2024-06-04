package com.mkpits.controlflowstructure;

public class FiboWithThreeNum {

	public static void main(String[] args) 
	{
		int a=0,b=1,c=2,total;
		System.out.println(a+"\n"+b+"\n"+c);
		
		for(int i=1;i<=10;i++)
		{
			total=a+b+c;
			System.out.println(total);
			a=b;
			b=c;
			c=total;
		}

	}

}
