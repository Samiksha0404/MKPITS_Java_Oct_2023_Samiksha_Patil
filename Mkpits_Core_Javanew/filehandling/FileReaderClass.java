package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {

		// file reder class used to read the data from file
		FileReader read=new FileReader("F:\\\\MKPITS_NOTES\\\\Data.txt");
		BufferedReader br=new BufferedReader(read);
		String readData="";
		
		while((readData=br.readLine())!=null)
		{
			System.out.print(readData);
		}
		read.close(); // close the file
		System.out.println("\nFile readed");

	}

}
