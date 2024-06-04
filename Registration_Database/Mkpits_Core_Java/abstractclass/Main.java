package com.mkpits.abstractclass;

 class Main  {

	public static void main(String[] args) {
      
		Pig mypig = new Pig();
		mypig.animalSound();
		mypig.sleep();
		
		//for every class we need to create object for calling that class
		Tiger tiger = new Tiger();
		tiger.animalSound();
		tiger.sleep();
	}

}
