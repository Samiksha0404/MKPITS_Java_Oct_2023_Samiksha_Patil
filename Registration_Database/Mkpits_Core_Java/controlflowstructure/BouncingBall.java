package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BouncingBall {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.println("Bouncing Ball Game....");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Ball Bounce.....");
		int bounce=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=1;i<=bounce;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("Bounce press "+bounce);
				int k=Integer.parseInt(br.readLine());
				System.out.println();
				if(k!=bounce)
				{
					count++;
					break;
				}
				else
					System.out.println("Bounce tuchuk");
				//System.out.println(k);
			}
			if(count==3) 
			{
				System.out.println("Your life is gone....");
				break;
			}
			
		}
		
		

	}

}
