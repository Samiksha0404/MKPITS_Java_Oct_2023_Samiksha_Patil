package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Details..");
		String data=br.readLine();
		
		// file writer class used to write the data into file 
		FileWriter writeData=new FileWriter("F:\\MKPITS_NOTES\\Data.txt", true);
		writeData.write(data);
		writeData.close(); // close the stream 
		
		System.out.println("Data has been Added into File");
		
	}

}
