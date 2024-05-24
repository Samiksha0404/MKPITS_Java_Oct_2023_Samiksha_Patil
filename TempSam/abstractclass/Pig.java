package com.mkpits.abstractclass;

public class Pig extends Animal{

	@Override
	void animalSound() {
	 System.out.println("the pig makes sound : ghez ghez");
		
	}

	@Override
	void sleep() {
		super.sleep();
	}

}
