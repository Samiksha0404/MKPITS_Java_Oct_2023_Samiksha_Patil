package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRegistrationForm 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		GetSetDataForRegistration gsd=new GetSetDataForRegistration();
		System.out.println("Enter Your First Name :- ");
		gsd.setfName(br.readLine());
		System.out.println("Enter Your Last Name :- ");
		gsd.setlName(br.readLine());
		System.out.println("Enter your Email :- ");
		gsd.setEmail(br.readLine());
		System.out.println("Enter your Password :- ");
		gsd.setPassword(br.readLine());
		System.out.println("Enter Your Mobile Num :- ");
		gsd.setMobile(Long.parseLong(br.readLine()));
		System.out.println("Enter your Gender :-");
		gsd.setGender((char)br.read());
		br.readLine();// when we are using read method after that we should used rwadLine method
		System.out.println("Enter Your Age :-");
		gsd.setAge(Integer.parseInt(br.readLine()));
		
		System.out.println("Your First Name :- "+gsd.getfName());
		System.out.println("Your Last Name :- "+gsd.getlName());
		System.out.println("Your Email :- "+gsd.getEmail());
		System.out.println("Your Paswword :- "+gsd.getPassword());
		System.out.println("Your Mobile No. :- "+gsd.getMobile());
		System.out.println("Your Gender :- "+gsd.getGender());
		

	}

}
