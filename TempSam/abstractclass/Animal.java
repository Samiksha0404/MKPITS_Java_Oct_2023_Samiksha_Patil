package com.mkpits.abstractclass;

public abstract class Animal {
// in abstract class we cannot create object 
	void sleep() {
		System.out.println("the sound of an animal sleep: zzzzz");
	}
	
	abstract void animalSound();
	//abstract method doesnot have body
}

//another class
class Tiger extends Animal{

	@Override
	void animalSound() {
		System.out.println("the tiger make sound: roar roar");
		
	}
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	
}
