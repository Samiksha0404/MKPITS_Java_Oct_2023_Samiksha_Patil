package com.mkpits.non_static_method;

public class MethodWithReturnType {

	public static void main(String[] args) {
		
		MethodWithReturnType mrt=new MethodWithReturnType();
		//String detail =mrt.getFDetails(1,10000);
		//System.out.println(detail);
		System.out.println(mrt.getFDetails(1, 50256));
		
		

	}

	private String getFDetails(int id, int salary) {
		
		double intensive=salary+(salary*0.1);
		//String details="Id is "+id+"\nSalary is "+intensive;
		//return details;
		return "Id is "+id+"\nSalary is "+intensive;
	
	}

}
