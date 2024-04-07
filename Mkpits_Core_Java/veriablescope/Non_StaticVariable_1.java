package com.mkpits.veriablescope;

public class Non_StaticVariable_1 {
	
	byte rollNo;
	short pinCode;
	int serialNum;
	long mobNum;
	char firstLetter;
	float petrolPrice;
	double salary;
	boolean isDigit;

	public static void main(String[] args) {
		
		Non_StaticVariable_1 ns=new Non_StaticVariable_1();
		System.out.println("Roll Number is:- "+ns.rollNo);
		System.out.println("Pin Code is :- "+ns.pinCode);
		System.out.println("Serial Number Of product is :- "+ns.serialNum);
		System.out.println("Mobile Number :- "+ns.mobNum);
		System.out.println("Current Petrol Price :- "+ns.petrolPrice);
		System.out.println("Salary :- "+ns.salary);
		System.out.println("Is Digit :- "+ns.isDigit);
		

	}

}
