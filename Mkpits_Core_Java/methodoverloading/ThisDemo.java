package com.mkpits.methodoverloading;

public class ThisDemo {
 String fname="Samiksha";
 String name="samiksha";
 int pincode;
 int order;
 //this is the keyword used to access class variable /global variable and for methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo t= new ThisDemo();
		//System.out.println(t.this.pincode);
		String name="Patil";
	 String fname ="harsh";
     //ThisDemo t = new ThisDemo();
     t.getOrder(234);
     t.getPincode(440012);
     t.getFName();
    // System.out.println(this.name+"" +name);----->>>not possible because nonstatic variable cannot be called directly and 
     //this keyword is only used to assign value to variable
	}
private String getFName() {
	// TODO Auto-generated method stub
	this.fname=fname;
	System.out.println("the first name is: "+fname);
	return fname;
}
private int getPincode(int i) {
	// TODO Auto-generated method stub
	this.pincode=i;
	System.out.println("the pincode is : "+pincode);
	return pincode;
	
}
private int getOrder(int i) {
	// TODO Auto-generated method stub
	this.order= i;
	System.out.println("The order number is  "+order);
	return order;
}

}
