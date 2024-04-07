package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStramClass {

	public static void main(String[] args) throws IOException {

		FileInputStream inputStream=new FileInputStream("F:\\\\MKPITS_NOTES\\\\Details.txt");
		int read=0;
		
		while((read=inputStream.read())!=-1)
		{
			System.out.print((char)read);
		}
		
		inputStream.close();
		
		System.out.println("File read Successfully");

	}

}
