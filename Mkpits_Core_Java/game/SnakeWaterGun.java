package com.mkpits.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeWaterGun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SnakeWaterGun swg =  new SnakeWaterGun();
		swg.developLogic();
		
		}

	private void developLogic() throws IOException {
     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	  System.out.println("welcome to snake, water and Gun Game");
	   char ch='y';
	   String systemInput = null;
	   while(ch == 'y'  || ch == 'Y') {
		   
		   int random = (int)Math.ceil(Math.random()*100);
		   
		   
		if(random >= 1 && random < 33) {
			   systemInput = "s";
		   }
		   if(random > 33 && random <= 66) {
			   systemInput = "w";
		   }
		   if(random > 66 && random <= 100) {
			   systemInput = "g";
		   }
		   
		   System.out.println(systemInput);
		   System.out.println("Enter your choice \n1.S\n2.W\n3.G");
		   String userInput = br.readLine();
		   
		   if((systemInput.equalsIgnoreCase("S")&& userInput.equalsIgnoreCase("w")) ||
				   systemInput.equalsIgnoreCase("w")&& userInput.equalsIgnoreCase("S")){
					   System.out.println("Snake wins");
				   }
		   if((systemInput.equalsIgnoreCase("w")&& userInput.equalsIgnoreCase("g")) ||
				   systemInput.equalsIgnoreCase("g")&& userInput.equalsIgnoreCase("w")){
					   System.out.println("water wins");
				   }
		   if((systemInput.equalsIgnoreCase("s")&& userInput.equalsIgnoreCase("g")) ||
				   systemInput.equalsIgnoreCase("g")&& userInput.equalsIgnoreCase("s")){
					   System.out.println("gun wins");
				   }
		   System.out.println("Do you wish to Continue Y/N");
			ch = (char) br.read();
			br.readLine();
			
	    }
	}

}
