package com.mkpits.methodoverloading;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Methods m = new Methods();
   m.getData();
   m.getData('F', "Java");
   m.getData(97394567893L,22);
   m.getData(23450,10000.0);
   m.getData(23450.0,10000);
   m.getData(234455,100000,5000);
	}

	private String getData(int i, double j, float k) {
		// TODO Auto-generated method stub
		String ctc=  i +" , "+j+" , "+k;
		System.out.println("the salary details are: Basesalary,Benefits,IncomeTax:"+ctc);
		return  ctc;
	}

	private double getData(int i, double j) {
		// TODO Auto-generated method stub
		int baseSalary = i;
		double benefits = j;
		double totalSalary = i+j;
		System.out.println("The total salary is:"+totalSalary+" base salary is :"+baseSalary+"the benefits given :"+benefits);
		return totalSalary;
	}
	private double getData(double i, double j) {
		// TODO Auto-generated method stub
		double baseSalary = i;
		double benefits = j;
		double totalSalary = i+j;
		System.out.println("The total salary is:"+totalSalary+" base salary is :"+baseSalary+"the benefits given :"+benefits);
		return totalSalary;
	}
	private void getData(long l, int a) {
		// TODO Auto-generated method stub
	 long mob = l;
	 int age = a;
	 
	 System.out.println("mobile number is:"+mob+"age is:"+a);
	}

	private void getData(char c, String s) {
		// TODO Auto-generated method stub
		char gender = c;
		String batch = s;
		System.out.println("the batch is:"+batch);
		System.out.println("the gender is:"+c);
	}

	private void getData() {
		// TODO Auto-generated method stub
		String name = "Samiksha Patil";
		
	}

}
