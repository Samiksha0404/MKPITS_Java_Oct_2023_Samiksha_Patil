package com.mkpits.registration;

public class ModelClass {
	int id;
 String name;
 String mobile;

 String city;
 String gender;
 String age;

 String email;
 String password;
public ModelClass(int id, String name, String mobile, String city, String gender, String age, String email,
		String password) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.city = city;
	this.gender = gender;
	this.age = age;
	this.email = email;
	this.password = password;
}
public ModelClass(String name, String mobile, String city, String gender, String age, String email, String password) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.city = city;
	this.gender = gender;
	this.age = age;
	this.email = email;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "ModelClass [id=" + id + ", name=" + name + ", mobile=" + mobile + ", city=" + city + ", gender=" + gender
			+ ", age=" + age + ", email=" + email + ", password=" + password + "]";
}
  
}
