package com.mkpits.set;

import java.util.ArrayList;

public class TreeNode {

	
		String data;
		ArrayList<TreeNode> children ;
		
public 	TreeNode(String data) {
	this.data = data;
	this.children = new ArrayList<TreeNode>();
}
    public void addChild(TreeNode node) { 
    	this.children.add(node);
    }
		
   public String print(int level) {
	   String ret;
	   ret = " ".repeat(level)+ data + "\n";
	   for (TreeNode treeNode : this.children) {
		ret += treeNode.print(level + 1);
	}
	   return ret;
   }
	}


