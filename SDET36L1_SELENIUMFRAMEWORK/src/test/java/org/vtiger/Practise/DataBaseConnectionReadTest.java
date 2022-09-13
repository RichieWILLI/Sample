package org.vtiger.Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseConnectionReadTest {

	public static void main(String[] args) throws SQLException {
		//create object for driver given by vendor
		Driver driver=new Driver();
		
		//register the driver to jdbc
		DriverManager.registerDriver(driver);
		
		//establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		
		//create statement
		Statement statement = connection.createStatement();
		
		//query
		ResultSet result = statement.executeQuery("select * from sdet36ll");
		
		//validate
		int count=0;
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString("Ename"));
			if(result.getString("Ename").equals("richard")) {
				System.out.println("data is present in the table");
			count++;
			break;
			}
		}
		if(count==0) {
			System.out.println("data is not present");
		}
		
		//close the connection
		connection.close();
		
		

	}

}
