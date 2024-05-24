package com.mkpits.collections;

public class ModelClass {

 int id;
 String name;
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
public ModelClass(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "ModelClass [id=" + id + ", name=" + name + "]";
}
 
	}


