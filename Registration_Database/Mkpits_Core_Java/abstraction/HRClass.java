package com.mkpits.abstraction;

public class HRClass {

	public static void main(String[] args) 
	{
		Employee e=new Manager(1001.76, "Raj Walavkor", 25, "Nagpur", 23);
		e.employeeInfo();
		System.out.println("Total Salary  of the Month for Manager "+e.calculateSalary());

	}

}
