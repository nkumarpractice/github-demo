package com.accenture.adf.newcodington.module13.activity;

//It is a Utility class which helps in obtaining a DataBase connection
import java.sql.*;

public class ConnectionToDB {
	
	static Connection con ;

	//	This source code tries to establish a connection to a MySQL server
	//	and displays a message concerning the error if connection fails
	
	//Following method creates a connection and returns it
	public static Connection getConnection() {

		try {
			String url = "jdbc:mysql://localhost/codingtondb";
			String user = "root";
			String pass = "abcd1234";
			
			//Loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Obtaining a connection using DriverManager class
			con = DriverManager.getConnection(url, user, pass);
		
						
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return con;
	}
	public static void closeConnection()
	{	
		try {
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
