package com.anudip.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecoundJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");

		Statement stmt= con.createStatement();

		//Insert Data
		ResultSet rs= stmt.executeQuery("select * from emp");

		int id;
		String name, desig, dept;
		int sal;
		System.out.println("Employee Details");

		while(rs.next())
		{
			id=rs.getInt(1);
			name=rs.getString(2);
			desig=rs.getString(3);
			dept=rs.getString(4);
			sal=rs.getInt(5);

			System.out.println(id+ " "+ name+ " "+ desig+ " "+ dept+ " "+ sal);
		}
		//Update Data
//		try
//		{
//			String sql1 = "update emp setempid=?  where name=?";
//			PreparedStatement ps = con.prepareStatement(sql1);
//			ps.setString(1, )
//		}
		// Delete Data
		try
		{
			String sql= "DELETE from emp where empid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.executeUpdate();
			System.out.println("Record Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		//
		con.close();
	}

}