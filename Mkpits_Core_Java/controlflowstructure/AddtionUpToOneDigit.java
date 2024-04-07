package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddtionUpToOneDigit 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,sum=0;
		System.out.println("Enter The Number:-");
		num=Integer.parseInt(br.readLine());
		if(num>=10)
		{
			while(num>0 || sum>9)
			{
				if(num==0)
				{
					num=sum;
					sum=0;
				}
				sum+=num%10;
				num=num/10;
			}
		}else
			sum=num;
		
		System.out.println("The Total Sum is :"+sum);

	}
}
