package com.mkpits.thiskeyword;

public class ThisKeywordUseInConstructor 
{
	int id;
	String name;
	long mob;
	
	
	public ThisKeywordUseInConstructor(int id, String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	public ThisKeywordUseInConstructor(int id, String name, long mob)
	{
		//this(id,name);
		this.id=id;
		this.name=name;
		this.mob=mob;
	}

	public static void main(String[] args) 
	{
		ThisKeywordUseInConstructor obj1=new ThisKeywordUseInConstructor(1, "Ashu");
		ThisKeywordUseInConstructor obj2=new ThisKeywordUseInConstructor(2, "Ashik", 9834826072l);
		obj1.displayDetails();
		System.out.println("===========================");
		obj2.displayDetails();
	}
	
	void displayDetails()
	{
		System.out.println("Id :-"+id);
		System.out.println("Name :-"+name);
		System.out.println("Mobile No. :-"+mob);
	}

}
