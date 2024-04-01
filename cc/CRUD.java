package lab1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		
		
		
		
		try
		{
			//read and establish connection.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mydatabase", "root", "sharda1234@");
		Statement statement=connection.createStatement(); 
		statement.executeQuery("CREATE TABLE testtable(id INT , name VARCHAR(45)");
//		while(set.next())
//		{
//			
//			System.out.println(set.getInt(1)+" "+set.getString(2));
//			
//		}
				
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

