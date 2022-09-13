package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseConnectionTest {

	public static void main(String[] args) throws SQLException {
		//creating object for driver given by vendor
		Driver driver=new Driver();
		//resigtor the driver to jdbc
		DriverManager.registerDriver(driver);
		//establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		//create statement
		Statement statement = connection.createStatement();
		//excute the query
		int result = statement.executeUpdate("insert into sdet36ll values(678,'richard',9880063157,'rich456@gmail.com')");
		//validate
		if(result==1)
		{
			System.out.println("data entered into database");
		}
		//close the connection
		connection.close();
		
	}

}
