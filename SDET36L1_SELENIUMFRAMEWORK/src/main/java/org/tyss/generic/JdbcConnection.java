package org.tyss.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcConnection {
private	Driver dbDriver;
private	Connection connection;
private	Statement statement;
private	ResultSet data;
private int results;
	
	public void gettingDataFromDataBase(String urlOfJdbc,String usnRMGY,String psdRMGY) {
	try {
		dbDriver=new Driver();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			DriverManager.registerDriver(dbDriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(urlOfJdbc,usnRMGY,psdRMGY);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}			
		
	
	public ResultSet exequteQuery(String writeQuery) {
		try {
			data = statement.executeQuery(writeQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	
	public int writeQueryIntoJdbc(String insertionStatement) {
		try {
			results = statement.executeUpdate(insertionStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
	
	
	
}
