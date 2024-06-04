package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumberCatcher {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Any Number Between 1 to 100");
//		int num=Integer.parseInt(br.readLine());
		
		byte sysNum=(byte) Math.ceil(Math.random()*100) ;
		System.out.println(sysNum); 
		//int count=0;
		int num=0;
		System.out.println("Enter Any Number Between 1 to 100");
		for(int i=1;i<=10;i++)
		{
			
			num=Integer.parseInt(br.readLine());
			if(num>sysNum)
			{
				System.out.println("Your Number is bigger Enter again");
				//count++;
				
			}
			if(num<sysNum)
			{
				System.out.println("Your Number is Less enter again");
				//count++;
			}
			if(num==sysNum)
			{
				System.out.println("you win");
				//System.out.println("your Number of Attempt is "+count);
				System.out.println("Attempt"+i);
				break;
			}
			if(num!=sysNum && i==10)
			{
				System.out.println("You lost your attempts Game Over");
			}
			continue;
			
		}
//		if(count>=10)
//		{
//			System.out.println("You lost your attempt");
//		}
		
		
		

	}

}
