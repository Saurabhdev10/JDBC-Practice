package com.jdbc.statement.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

//5 April 2023
public class PreparedStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "mysql123@");
			System.out.println(con);
//			insert into customer_table(id, name,age) values (1,"Saurabh",23)	
//			Insert record using statement  object 
			PreparedStatement ps = con.prepareStatement("insert into customer_table values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			int id;
			String name;
			int age;
			System.out.print("How many entry you want:");
//		int entry=sc.nextInt();
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter a customer Details: ");
				id = sc.nextInt();
				sc.nextLine();
				name = sc.nextLine();
				age = sc.nextInt();
				sc.close();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				int res = ps.executeUpdate();
				System.out.println("inserted : " + res);
			}

		} catch (ClassNotFoundException | SQLException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}

	}

}
