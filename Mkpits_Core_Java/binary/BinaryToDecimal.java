package com.mkpits.binary;

public class BinaryToDecimal 
{
	public static void main(String[] args) {
		
		String binaryNum="1100110101";
		int decimalNum=Integer.parseInt(binaryNum, 2);
		System.out.println("Decimal Value----> "+decimalNum);
	}
}
