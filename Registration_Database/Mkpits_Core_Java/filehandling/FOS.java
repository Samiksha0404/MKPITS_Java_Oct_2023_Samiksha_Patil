package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FOS {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data to be written");
		String str = br.readLine();
		
		str = str +"\n";
		//	A file output stream is an output stream for writing data to a File or to a FileDescripitor
		FileOutputStream fos = new FileOutputStream("E:\\xyz.txt" , true);
         byte b[] = str.getBytes();
         fos.write(b);
         fos.close();
         System.out.println("Data is Written");
	}

}
