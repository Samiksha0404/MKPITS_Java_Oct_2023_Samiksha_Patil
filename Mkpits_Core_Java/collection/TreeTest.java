package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class TreeTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeNode drink=new TreeNode("Drinks");
		TreeNode food=new TreeNode("Food");
		TreeNode hot=new TreeNode("Hot Drinks");
		TreeNode cold=new TreeNode("Cold Drinks");
		
		drink.addChild(hot);
		drink.addChild(cold);
		
		TreeNode tea=new TreeNode("Tea");
		TreeNode coffee=new TreeNode("Coffee");
		TreeNode soup=new TreeNode("Soup");
		
		hot.addChild(tea);
		hot.addChild(coffee);
		hot.addChild(soup);
		
		TreeNode pepsi=new TreeNode("Pepsi");
		TreeNode coldcoffee=new TreeNode("Cold Coffee");
		TreeNode water=new TreeNode("Chilled Water");
		
		cold.addChild(water);
		cold.addChild(coldcoffee);
		cold.addChild(pepsi);
		System.out.println(drink.print(0));
		System.out.println(food.print(0));

	}

}
