package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS {

	public static void main(String[] args) throws IOException {
		//for byte we use input and output stream
		//A FileInputStream from obtains input bytes a File in a file System
	
		FileInputStream fis = new FileInputStream("E:\\xyz.txt");
		int b= 0;
		
        while((b= fis.read())!= -1) // read byte one by one
     {
	System.out.print((char) b); // remove char and sec o/p
     }
      fis.close();
	}

}
