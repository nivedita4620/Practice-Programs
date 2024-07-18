package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementDemo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");

		//PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?,?,?))");
		int id;
		String name, desig, dept;
		int sal;
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);

		System.out.println("Enter the ID:");
		id=sc.nextInt();

		System.out.println("Enter the Name:");
		name=sc.nextLine();

		System.out.println("Enter the Department:");
		dept=sc.nextLine();

		System.out.println("Enter the Designation:");
		desig=sc.nextLine();

		System.out.println("Enter the Salary:");
		sal=sc.nextInt();

		PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, dept);
		pstmt.setString(4, desig);
		pstmt.setInt(5, sal);

		int i=pstmt.executeUpdate();
		con.close();
		System.out.println("Record Added ");
	}

}
