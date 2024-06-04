package com.mkpits.scopeofvariable;

public class NonsStaticVar {
	public char interested = 'Y';
	public int pinCode = 440012;
	public byte num = 123;
	public short employeeID = 2446;
	public long mobNumber= 98764346613356L;
	public boolean isActive = false ;
	public float salary = 567897.67F;
	public  double sales = 456.678;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonsStaticVar var =  new NonsStaticVar();
		
		System.out.println("Are you interest to logout : "+ var.interested);
		System.out.println("This is the Pincode :" +var.pinCode);
		System.out.println("This is the number : " +var.num );
		System.out.println("This is the employeeID :" +var.employeeID);
		System.out.println("This is the mobNumber :" +var.mobNumber);
		System.out.println("This is Active :" +var.isActive);
		System.out.println("This is the Salary :" +var.salary);
		System.out.println("This is the sale :"+var.sales);
			

	}

}
