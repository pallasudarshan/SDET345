package annapuran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Ts {

	public static void main(String[] args) throws SQLException {
		//Register the driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		// Create the connection from database;
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
		//create Sql statement
		
		con.createSQLXML();

	}
}
