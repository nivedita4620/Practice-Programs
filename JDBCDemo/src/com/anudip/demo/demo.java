package com.anudip.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class demo {

	public void create() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293?useSSL=false", "root", "root");

		PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS Actor (aid INT AUTO_INCREMENT PRIMARY KEY, aname VARCHAR(50), age INT, agender VARCHAR(50), movie_name VARCHAR(50))");

		int result = ps.executeUpdate();

		if (result == 0)
		{
			System.out.println("Table is Created...!!!");
		}
		else
		{
			System.out.println("Table already exists...!!!");
		}
	}

	public void update() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("Update Actor set aname=?, age=?, agender=?, movie_name=? where aid = ?");	//to update a data

		int id;
		String name, age, gender, movie_name;

		Scanner sc = new Scanner(System.in);	//give a input from user

		System.out.println("Update Actor Details...");

		System.out.println("Enter the Actor ID: ");
		id = sc.nextInt();

		System.out.println("Enter the Actor Name: ");
		name = sc.next();

		System.out.println("Enter the Actor Age: ");
		age = sc.next();

		System.out.println("Enter the Actor Gender: ");
		gender = sc.next();

		System.out.println("Enter the Actor Movie Name: ");
		movie_name = sc.next();

		ps.setInt(5, id);
		ps.setString(1, name);
		ps.setString(2, age);
		ps.setString(3, gender);
		ps.setString(4, movie_name);

		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Actor Data is Updated Successfully...");
	}

	public void delete() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("delete from Actor where aid = ?");	//to update a data

		int id;

		Scanner sc = new Scanner(System.in);	//give a input from user

		System.out.println("Delete Actor Details...");

		System.out.println("Enter the Actor ID: ");
		id = sc.nextInt();

		ps.setInt(1, id);

		int i = ps.executeUpdate();		//executeUpdate return a int.
		con.close();
		System.out.println(i + "Actor Data is Deleted Successfully...");
	}

	public void insert() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293", "root", "root");

		PreparedStatement ps = con.prepareStatement("insert into Actor values(?,?,?,?,?)");	//to insert a data

		int id;
		String name, age, gender, movie_name;

		Scanner sc = new Scanner(System.in);	//give a input from user

		System.out.println("Insert the Actor Details...");

		System.out.println("Enter the Actor ID: ");
		id = sc.nextInt();

		System.out.println("Enter the Actor Name: ");
		name = sc.next();

		System.out.println("Enter the Actor Age: ");
		age = sc.next();

		System.out.println("Enter the Actor Gender: ");
		gender = sc.next();

		System.out.println("Enter the Actor Movie Name: ");
		movie_name = sc.next();

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, age);
		ps.setString(4, gender);
		ps.setString(5, movie_name);

		int i = ps.executeUpdate();		//executeUpdate return a int.


		System.out.println(i + "Actor Data is Added Successfully...");
		con.close();
	}

	public void age() throws ClassNotFoundException, SQLException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/batch7293","root","root");

		 Statement stmt = con.createStatement();

		 System.out.println("Employee details are:");

		 ResultSet rs = stmt.executeQuery("select * from Actor where age>18");	//executeQuery return type is resultSet

		 int id;
		 String name, gender, movie_name;
		 int age;

		 System.out.println("Actor Details: ");
		 System.out.println("==================");

		 while(rs.next())
		 {
		    id = rs.getInt(1);
			name = rs.getString(2);
			age = rs.getInt(3);
			gender = rs.getString(4);
			movie_name = rs.getString(5);

			System.out.println(id+ " " +name+ " " +age+ " " +gender+ " " +movie_name);

		}

		 con.close();
	}

	public void exit()
	{
		System.out.println("Please Enter Valid Input...!!!");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		demo jdbc = new demo();

		while(true)
		{
			System.out.println("Choose any Option: 1.Create  2.Update  3.Delete  4.Insert 5.Age 6.Exit");
			int ch = sc.nextInt();


		switch(ch)
		{
			case 1:
				jdbc.create();
				break;

			case 2:
				jdbc.update();
				break;

			case 3:
				jdbc.delete();
				break;

			case 4:
				jdbc.insert();
				break;

			case 5:
				jdbc.age();

			case 6:
				jdbc.exit();
				break;

		}

		}

	}

}
