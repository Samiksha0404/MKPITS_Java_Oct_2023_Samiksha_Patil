package com.mkpits.method;

public class MulDatatypeArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulDatatypeArg o = new MulDatatypeArg ();
		String value = o.getdetails("Samiksha",9730414605l, "samiksha@gmail.com", 52);
		System.out.println(value);
	}

	private String getdetails(String name,long num , String email , int id) {
		// TODO Auto-generated method stub
		String details = " the candidate name is: "+name + " ,"+ num +" , "+ email +" ," +id;
		return details;
	}

}
