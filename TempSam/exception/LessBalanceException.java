package com.mkpits.exception;

public class LessBalanceException extends Exception {
	
	int amount;
	public LessBalanceException() {
		System.out.println("Default Constructor called");
	}
	public LessBalanceException(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "You don't have sufficient Balance , your balance is " + amount;
	}
	
	

}
