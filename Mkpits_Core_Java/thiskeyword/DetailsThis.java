package com.mkpits.thiskeyword;

public class DetailsThis 
{
	int id;
	String name;
	long mob;
	char gender;
	String email;
	
	
	
	public DetailsThis(int id, String name, long mob, char gender, String email) 
	{
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.gender = gender;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getMob() {
		return mob;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
