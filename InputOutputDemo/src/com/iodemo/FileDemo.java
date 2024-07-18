package com.iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1=new File("input.txt");
		File f2=new File("output.txt");

		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		
		int ch;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copy hua!!! go and check");
	}

}
