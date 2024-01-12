package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterClass {

	public static void main(String[] args) throws IOException {
		
/* we  cannot write sys.out.print statement  in console web screen it can be only written in console thats why this print writer class is used for screen printing
 *this second true is for automatic flush out (flush means it will be removed from queue pipe 
 * here we are writing file path in file writer so iT will write this below print statement directly into the
 * */	
    PrintWriter pw = new PrintWriter(System.out , true);
    pw.println("It works");
    
    PrintWriter pw1 = new PrintWriter(new FileWriter("E:\\mkpits_workspace\\CoreJava_Samiksha_Patil\\src\\com\\mkpits\\filehandling\\inputStream.txt",true), true);
	pw1.println("file writer says hello");
	pw1.close();
	}

}
