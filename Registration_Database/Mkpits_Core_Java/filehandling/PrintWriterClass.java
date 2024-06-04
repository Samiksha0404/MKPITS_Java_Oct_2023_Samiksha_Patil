package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {

		PrintWriter pw=new PrintWriter(new FileWriter("F:\\MKPITS_NOTES\\Details.txt",true), true);
		pw.println("Hello Java");
		
		System.out.println("Closed ");
		
		
	}

}
