package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileWriterClass {
// for char type data we use file writer
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data");
		String str = br.readLine();
		str = str +"\n ";
		
		FileWriter fw = new FileWriter("E:\\mkpits_workspace\\CoreJava_Samiksha_Patil\\src\\com\\mkpits\\filehandling\\login.txt", true);
		fw.write(str);
		fw.close();
		
	}

}
