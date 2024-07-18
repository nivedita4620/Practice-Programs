package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC stands for Java Database Connectivity.
 * JDBC is a Java API to connect and execute the query with the database.
 * It is a part of JavaSE (Java Standard Edition).
 * JDBC API uses JDBC drivers to connect with the database.
 * java (JDBC API ) application programming interface
 * application programming interface: collection of interfaces and classes
 * There are four types of JDBC drivers:
 * 1. JDBC-ODBC Bridge Driver,/ Type 1 JDBC Driver
   2. Native Driver, / Type 2 JDBC Driver
   3. Network Protocol Driver, / Type 3 JDBC Driver
   4.Thin Driver / Type 4 JDBC Driver
  */
public class MyFirstJDBCDemo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// step 1: Register the Driver
		// Im Using mysql data base I need to to install mysql database
		// when i will register the driver so i need mysql driver
		//required the url of mysql which i install in my system
		//register username and password


		/*
		 * com.mysql.jdbc.Driver
		 * com.mysql.cj.jdbc.Driver
		 * jdbc:mysql://localhost:3306/mydb
		 * (java)API:Database//localhost:port no/database name==>port no allways 3306*/

		// step 1: Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//step 2: create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");

		// step 3:create  sql statements
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into emp values (5, 'Mansi',' Trainer','IT',35000)");
		System.out.println("Employee added!");
		con.close();
	}

}
