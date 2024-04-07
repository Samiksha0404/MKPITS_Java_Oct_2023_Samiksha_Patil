package com.mkpits.collectiongeneric;

public class PrintIntegerArray 
{
	

	public static void main(String[] args) 
	{
		
		Integer[] number=new Integer[10];
		number[0]=40;
		number[1]=45;
		number[2]=46;
		number[3]=56;
		number[5]=470;
		number[7]=75;
		number[9]=89;
		print(number);
		System.out.println("Length of the Integer Array-->"+number.length);

	}

	private static void print(Integer[] number) 
	{
		for (Integer value : number) 
		{
			System.out.println("Value-->"+value);
		}
		
	}

}
