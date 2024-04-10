package com.mkpits.model;

public class Student {
private String firstName;
private String lastName;
private boolean premium;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public boolean isPremium() {
	return premium;
}
public void setPremium(boolean premium) {
	this.premium = premium;
}
public Student(String firstName, String lastName, boolean premium) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.premium = premium;
}}