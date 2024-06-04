package com.mkpits.method;

public class MethodReturnWithMulArg {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 MethodReturnWithMulArg m = new  MethodReturnWithMulArg();
		String value= m.getDetails(30,10000);
		System.out.println(value);
	}
// the datatype of variable to be called and method should have same datatype
	private String getDetails(int id, int salary) {
		// TODO Auto-generated method stub
		double incentive = salary+(salary*0.1);
		String details = "This is the id : "+id+ ", this is the salary "+incentive;
		// "This is the id : "+id+ ", this is the salary "+incentive we can print this way when we have to return
		// multiple variable
		return details;
	}

}
