package com.mkpits.inheritance;

public class Super2 extends Super1{
	
	int x = 180;
	
	public void addData() {
		int z = x + super.x;
		System.out.println("Add :- "+z);
	}
	Super2()
	{
		super();
	
		System.out.println("This is default constructor of sub class 2= " +x);
	}
    
	Super2(int x){
		//super();
//		this.x = x;
		System.out.println("This is parameterised constructor of sub class 2 = " + x);
	}
}
