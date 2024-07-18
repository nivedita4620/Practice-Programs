package com.iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {

	public static void main(String[] args) throws IOException {
		/*ill will take input from java means i will hardcode the string variable 
		and write that string on file
		
		String="kasndklasd0"; // hard code the string 
		copy this on the onther file
		
		input.txt*/
		
		File file =new File("input.txt");
		
		String str="copy this string to File";
		
		FileWriter writer=new FileWriter(file);
		
		writer.write(str);
		writer.close();
		
		
		

	}

}
