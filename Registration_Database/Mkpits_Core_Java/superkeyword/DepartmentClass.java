package com.mkpits.superkeyword;

public class DepartmentClass extends HospitalClass
{
	String name;
	int pinCode;
	
	DepartmentClass(String name , String dName, int pinCode) 
	{
		super(name);
		this.name=dName;
		this.pinCode=pinCode;
	}

	void displayData()
	{
		System.out.println("Name of the Hospital : "+super.name);
		System.out.println("Name of the Department : "+this.name);
	}
	
}
