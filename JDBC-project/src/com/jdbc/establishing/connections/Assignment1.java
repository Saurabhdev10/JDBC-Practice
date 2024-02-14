package com.jdbc.establishing.connections;

import java.sql.Connection;
import java.sql.DriverManager;

//5 April 2023
public class Assignment1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","mysql123@");
			System.out.println("Connection Established Succesfully:"+con);
		}
		
		catch(Exception e) {
			System.out.println("Connection not established: "+e.getMessage());
		}
	}

}
