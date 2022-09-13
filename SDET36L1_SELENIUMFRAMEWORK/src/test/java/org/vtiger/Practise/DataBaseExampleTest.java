package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import com.mysql.cj.jdbc.Driver;

public class DataBaseExampleTest {

	public static void main(String[] args) throws SQLException {
		
		//creating object for driver
		
		Driver driverDb= new Driver();
		
		
		//resgistoring the driver to jdbc
		
		DriverManager.registerDriver(driverDb);
		
		//getconnection
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		//writing statement
		Statement statement = connection.createStatement();
		
		//executing the quary
		
		ResultSet result = statement.executeQuery("select * from project");
		
		//validate
		
		while(result.next()) {
			String data = result.getString("project_name");
			if(data.equals("Richard84")) {
			
				System.out.println("data is present");
				break;
			}

			
			
		}
		
		connection.close();
		
		
		
	}

}
