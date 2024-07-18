package com.iodemo;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIODemo 
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("primitive.txt");
		DataOutputStream dos = new DataOutputStream(fos);   
		dos.writeBoolean(true);
		dos.writeInt(20);
		dos.writeDouble(2.4);
		dos.close();
		fos.close();
		
		System.out.println("File Created Successfully!");
		System.out.println("===========================");
		System.out.println("File Reading");
		
		FileInputStream fis = new FileInputStream("primitive.txt");
		DataInputStream dis = new DataInputStream(fis); 
//		System.out.println(dis.readBoolean());//true
//		System.out.println(dis.readInt());//20
//		System.out.println(dis.readDouble());//2.4
		
		//or
		
		System.out.println(dis.readInt());//16777216
		System.out.println(dis.readDouble());//3.805153588162656E-211
		System.out.println(dis.readBoolean());//true
//		
	}

}
