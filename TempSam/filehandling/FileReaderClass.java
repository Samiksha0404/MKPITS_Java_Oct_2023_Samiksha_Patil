package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
//for char type data we use file reader

	public static void main(String[] args) throws IOException {
	
	
	FileReader fr = new FileReader("E:\\\\mkpits_workspace\\\\CoreJava_Samiksha_Patil\\\\src\\\\com\\\\mkpits\\\\filehandling\\\\login.txt"); 
   //:-Convenience class for reading character files.FileReader is meant for reading Stream of character.
	
	BufferedReader br = new BufferedReader(fr);
    String data = "";
    while((data = br.readLine()) != null) 
    //data is in string therefore condition is give null
    {
    	System.out.println(data);
    	
    }
    
    fr.close();
	}
}
// we use "close()" so that no one should misused it and the file   must be  get closed



