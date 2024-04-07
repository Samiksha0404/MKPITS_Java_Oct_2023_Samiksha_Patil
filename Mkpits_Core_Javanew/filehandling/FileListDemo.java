package com.mkpits.filehandling;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {

		//File is class of java.io pack 
		File file=new File("E:\\mkpits_workspace\\CoreJava_Ashik_Tembhare");// specify the location
		
		//file.list() method returns the array of files and directories in the directory defined by this abstract path name.
		//The method returns null, if the abstract pathname does not denote a directory.
		String fileName[]=file.list(); 
		
		// Iterates all files from array
		for (int i = 0; i < fileName.length; i++) 
		{
			File file2=new File(file, fileName[i]);
			if(file2.isDirectory()) // used to check the directory or not
				System.out.println(file2.getName()+" is Directory");
			else if(file2.isFile())
				System.out.println(file2.getName()+" is File");
		}

	}

}
