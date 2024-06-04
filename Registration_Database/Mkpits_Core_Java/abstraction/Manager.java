package com.mkpits.abstraction;

public class Manager extends Employee 
{

	
	String empName;
	int age;
	String address;
	
	public Manager(double perDaySalary, String empName, int age, String address, int workingDays) 
	{
		super(perDaySalary, workingDays);
		this.empName = empName;
		this.age = age;
		this.address = address;
	}

	double calculateSalary() 
	{
		return perDaySalary*workingDays;
		
	}

	void employeeInfo() 
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Adress : "+address);
		System.out.println("Total working days : "+workingDays);
		
	}

}
