package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakAndContinueStatment {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		// break and continue is keyword having specific meaning and task ;
		// break keyword used when we wan to break that statement while running the program ;
		// break used in switch and looping statement break send control to the bottom of the block
		// continue is keyword used to continue the statement while in running program 
		// continue send control at  the beginning of the block 
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Series 1 4 9 16 36 49 64 .....");
		System.out.println("Enter your Number...");
		int num=Integer.parseInt(br.readLine());
		int series;
//		for(int i=1; i<=num;i++)
//		{
//			series=i*i;
//			if(i==5)
//			{
//				continue;
//				
//			}
//			System.out.println(series);
//		}
		
		int i=1;
		while(i<=num)
		{
			if(i!=5)
			{
				series=i*i;
				System.out.println(series);
			}
			i++;
			
		
		}
		

	}

}
