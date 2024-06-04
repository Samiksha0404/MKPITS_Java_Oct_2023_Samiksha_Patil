package com.mkpits.veriablescope;

public class Non_StaticVariable_2 {
	
	byte rollNo=36;
	short serialNum=440;
	int pinCode = 440023;
	long mobNum=8806335450l;
	char firstLetter='A';
	float petrolPrice=106.15f;
	double salary=102566.550;
	boolean isDigit=true;

	public static void main(String[] args) {
		
	Non_StaticVariable_2 nsv=new Non_StaticVariable_2();
	System.out.println("Roll Number is:- "+nsv.rollNo);
	System.out.println("Pin Code is :- "+nsv.pinCode);
	System.out.println("Serial Number Of product is :- "+nsv.serialNum);
	System.out.println("Mobile Number :- "+nsv.mobNum);
	System.out.println("Current Petrol Price :- "+nsv.petrolPrice);
	System.out.println("Salary :- "+nsv.salary);  
	System.out.println("Is Digit :- "+nsv.isDigit);
		

	}

}
