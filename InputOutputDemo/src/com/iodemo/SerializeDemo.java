package com.iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("PDetails.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person ps = new Person(01,"Nivedita");
		oos.writeObject(ps);
		
		oos.close();
		fos.close();
		System.out.println("File Created");
		System.out.println("=============");
		System.out.println("Reading object from file i.e. DeSerialization");
		
		FileInputStream fis = new FileInputStream("PDetails.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person ps1 =(Person)ois.readObject();
		System.out.println(ps1.getP_name());
		System.out.println(ps1.getP_name());
		//person object  ----------pid int pname string
		//object to primitive type coversion
	}

}
