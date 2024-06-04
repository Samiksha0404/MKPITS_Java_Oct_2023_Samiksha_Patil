package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleLevelInheritance {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ChildClass obj=new ChildClass();
		System.out.println("Enter Your First Name :");
		obj.setFirstName(br.readLine());
		System.out.println("Enter your last Name :");
		obj.setLastName(br.readLine());
		System.out.println("Enter Your Email :");
		obj.setEmail(br.readLine());
		System.out.println("Enter your mobile no. :");
		obj.setMobileNo(Long.parseLong(br.readLine()));
		System.out.println("Enter your gender :");
		obj.setGender(br.readLine());
		System.out.println("Enter Your Pin code :");
		obj.setPinCode(Integer.parseInt(br.readLine()));
		System.out.println("===================================");
		System.out.println("Your All Details :");
		obj.getDetails();

	}
	

}
