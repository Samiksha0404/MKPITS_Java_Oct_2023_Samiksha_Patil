package com.mkpits.typecasting;

public class GetterSetter {
 String name,mobile,email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter g = new GetterSetter("samiksha","76564545","sahghgh@");
		System.out.println(g.getEmail());
	
		g.setEmail("wwwwwwwww");
		System.out.println(g.getEmail());
		
   
	}
	
	
	public GetterSetter(String name, String mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}

