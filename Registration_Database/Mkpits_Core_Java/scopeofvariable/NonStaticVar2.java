package com.mkpits.scopeofvariable;

public class NonStaticVar2 {
	public char interested;
	public int pinCode;
	public byte num;
	public short employeeID;
	public long mobNumber;
	public boolean isActive;
	public float salary;
	public  double sales;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NonsStaticVar var =  new NonsStaticVar();
		
		System.out.println("Are you interest to logout "+ var.interested);
		System.out.println("This is the Pincode :" +var.pinCode);
		System.out.println("This is the number : " +var.num );
		System.out.println("This is the employeeID :" +var.employeeID);
		System.out.println("This is the mobNumber :" +var.mobNumber);
		System.out.println("This is Active :" +var.isActive);
		System.out.println("This is the Salary :" +var.salary);
		System.out.println("This is the sale :"+var.sales);
	}

}
