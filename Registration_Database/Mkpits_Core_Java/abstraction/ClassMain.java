package com.mkpits.abstraction;

public class ClassMain {

	public static void main(String[] args) 
	{
		// creating the object of corresponding sub classes
		ClassAnimal cp=new ClassPig();   
		ClassAnimal cc=new ClassCow();
		ClassAnimal ct=new ClassTiger();
		
		// calling abstract method from their respective sub classes
		cp.animalSound();
		cc.animalSound();
		ct.animalSound();
		
		// calling parent non static method 
		cp.legs();
		

	}

}
