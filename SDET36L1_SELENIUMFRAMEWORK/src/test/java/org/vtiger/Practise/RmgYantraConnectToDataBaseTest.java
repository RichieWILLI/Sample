package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class RmgYantraConnectToDataBaseTest {

	public static void main(String[] args) throws SQLException {

			Driver driver=new Driver();
			
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
		Statement statements = connection.createStatement();
		
		ResultSet result= statements.executeQuery("select * from project");
		int count=0;
		while(result.next())
		{
			System.out.println(result.getString(4));
			if(result.getString("project_name").equals("richie"))
			{
				System.out.println("the data is entered into database");
				count++;
				break;
			}
			
		}
			if(count==0)
			{
				System.out.println("the data is not entered");
			}
			
			connection.close();
		

	}

}
