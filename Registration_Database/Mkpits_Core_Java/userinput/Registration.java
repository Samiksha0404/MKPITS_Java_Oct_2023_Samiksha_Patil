package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Registration {

	
	String fName,lName,email, password;
	char gender;
	long mobile;
	int age;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        
		Registration r = new Registration();
		r.register();
	}
	public void register() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter first name ");
		 this.fName= br.readLine();
		 System.out.println("Enter last name ");
		 this.lName = br.readLine();
		 System.out.println("Enter  Email ");
		 this.email=br.readLine();
		 System.out.println("Enter  Gender ");
		 this.gender= (char)( br.read());//char has to typecast firstthen br.read
		  br.readLine();//_<-----
		 System.out.println("Enter Mobile number ");
		 this.mobile= Long.parseLong(br.readLine());
		 System.out.println("Enter Age ");
		 this.age= Integer.parseInt(br.readLine());
		 System.out.println("Enter password ");
		 this.password =br.readLine();
	}

}
