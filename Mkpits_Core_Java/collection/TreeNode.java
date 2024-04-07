package com.mkpits.collection;

import java.util.ArrayList;

public class TreeNode 
{
	String data;
	ArrayList<TreeNode> child;
	
	public TreeNode(String data) 
	{
		this.data = data;
		this.child=new ArrayList<TreeNode>();
	}
	
	void addChild(TreeNode node)
	{
		this.child.add(node);
	}
	
	String print(int index)
	{
		String returnString;
		returnString="  ".repeat(index)+data+"\n";
		for (TreeNode treeNode : this.child) 
		{
			returnString +=treeNode.print(index+1);
		}
		return returnString;
	}
	
}
