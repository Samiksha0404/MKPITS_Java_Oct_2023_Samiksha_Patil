package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputStreamClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your Data Into File ...");
		String inputData=br.readLine();
		inputData+="\n";
		
		FileOutputStream outputStream=new FileOutputStream("F:\\MKPITS_NOTES\\Details.txt",true);
		
		byte[]input=inputData.getBytes();
		
		
		outputStream.write(input);
		outputStream.close();
		
		System.out.println("Your Data Has been Added");
		
	}

}
