package com.mkpits.abstraction;

public abstract class Employee 
{
	
	double perDaySalary;
	int workingDays;
	public Employee( double perDaySalary, int workingDays) 
	{
		this.workingDays=workingDays;
		this.perDaySalary = perDaySalary;
	}
	 abstract double calculateSalary();
	 abstract void employeeInfo();
	 
	 
}
