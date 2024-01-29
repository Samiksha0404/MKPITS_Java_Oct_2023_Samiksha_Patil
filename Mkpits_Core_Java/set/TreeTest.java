package com.mkpits.set;

public class TreeTest {

	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		TreeNode snacks = new TreeNode("Snacks");
		
		//hot
		TreeNode chai = new TreeNode("Chai");
		TreeNode hotchocolate = new TreeNode("Hot Chocolate");
		TreeNode soup = new TreeNode("Soup");
		TreeNode coffee = new TreeNode("Coffee");
		
		//cold
		TreeNode coldCoffee = new TreeNode("Cold Coffee");
		TreeNode Milkshake = new TreeNode("Milk Shake");
		TreeNode colddrink = new TreeNode("Cold Drink");
		TreeNode limesoda = new TreeNode("Lime  Soda");
		
		
		
		//snacks
		TreeNode samosa = new TreeNode("Samosaa");
		TreeNode dosa = new TreeNode("Dosa");
		TreeNode cholaBhatura = new TreeNode("Chola Bhatura");
		TreeNode Kachori = new TreeNode("kachori");
		
		
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		
		hot.addChild(chai);
		hot.addChild(coffee);
		hot.addChild(hotchocolate);
		hot.addChild(soup);
		
		cold.addChild(coldCoffee);
		cold.addChild(colddrink);
		cold.addChild(Milkshake);
		cold.addChild(limesoda);
		
		
		snacks.addChild(Kachori);
		snacks.addChild(samosa);
		snacks.addChild(cholaBhatura);
		snacks.addChild(dosa);
		
		System.out.println(drinks.print(0));
		System.out.println(snacks.print(0));


		

	}

}
