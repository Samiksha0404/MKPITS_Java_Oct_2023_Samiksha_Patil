package com.mkpits.typecasting;

public class ExplicitTypeCast 
{

	public static void main(String[] args) 
	{
		
		// In explicit typecasting the larger range datatype converted into smaller
		// we have to do it manually 
		// explicit typecasting are called as narrowing 
		// in narrowing data has been losed due to converting of larger datatype into smaller datatype
		// there will be 3 ways of explicit typecasting 
		// 1. primitive to primitive 2. object to primitive vise versa 3. typecast between obj
		
		// 1. Primitive to Primitive
		System.out.println("Primitive to Primitive");
		float totalBill=1245.658f; // here larger range datatype
		System.out.println("Before typecast :"+totalBill); //1245.658
		
		int bill=(int)totalBill; // here data has lose // smaller datatype
		System.out.println("After typecast :"+bill); //1245
		
		System.out.println("===============================");
		
		// 2. object to primitive 
		System.out.println("object to primitive ");
		
		String pinCode="440023"; // here the string is class and pinCode is an object variable
		 int pCode=Integer.parseInt(pinCode);// here the in number which is in string type converte into total int data
		 System.out.println(pCode);
		
		 String input1="4586.2567" , input2="45879.0125";
		 float ip1=Float.parseFloat(input1);
		 float ip2=Float.parseFloat(input2);
		 
		 System.out.println("Addition :-"+(ip1+ip2));
		 
		 String mobNum="9834826072";
		 long mob=Long.parseLong(mobNum);
		 System.out.println(mob); // here the data converted string into long primitive datatype
		 System.out.println("===============================");
		 
		 // 3.Primitive datatype to object 
		 System.out.println("Primitive datatype to object ");
		 
		 int billNo=102; // you can any primitive datatype here
		 Integer i =new Integer(billNo); // here according to that data type wrapper class has been called 
		 System.out.println("Object variable value :"+i);
		

	}

}
