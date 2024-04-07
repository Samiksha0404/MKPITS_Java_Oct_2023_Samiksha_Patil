package com.mkpits.superkeyword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	// super is keyword used to call super class variable
	// by using super keyword we can call super class method 
	
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DepartmentClass d;
		System.out.println("Enter Hospital Name :");
		String hName=br.readLine();
		System.out.println("Enter Department Name :");
		String dName=br.readLine();
		System.out.println("Enter Pincode :");
		int pincode=Integer.parseInt(br.readLine());
		d=new DepartmentClass(hName, dName, pincode);
		d.displayData();

	}

}
