package com.jdbc.statement.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//5 April 2023

public class StatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "mysql123@");
			System.out.println(con);
//			insert into customer_table(id, name,age) values (1,"Saurabh",23)	
//			Insert record using statement  object 
			Statement st = con.createStatement();
			int res = st.executeUpdate("insert into customer_table values (2,'Sarvesh',20)");
			System.out.println("inserted: " + res);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
