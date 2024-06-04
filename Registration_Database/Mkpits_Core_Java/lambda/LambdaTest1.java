package com.mkpits.lambda;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		// lambda function
		FuncInterface obj=x ->System.out.println(2*x);  

		obj.funcAbstract(50);
	}

}
