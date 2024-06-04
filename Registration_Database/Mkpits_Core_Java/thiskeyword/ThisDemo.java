package com.mkpits.thiskeyword;

public class ThisDemo {

	public static void main(String[] args) {
	
		DetailsThis obj=new DetailsThis(101, "Ashik", 9834826072l, 'M', "ashikt128@gmail.com");
		
		System.out.println("Id :-"+obj.getId());
		obj.setId(102);
		System.out.println("Id :-"+obj.getId());

	}

}
