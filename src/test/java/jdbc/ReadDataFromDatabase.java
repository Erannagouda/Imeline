package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		// step1: create an instance for Driver
		// Driver should be imported from com.mysql.cj.jdbc.Driver
		// new Driver() throws SQLException
		Driver dbdriver = new Driver();

		// step2: Register to the dbDriver
		// DriverManager is in java.sql package
		DriverManager.registerDriver(dbdriver);

		// step3: Establish database connection
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/lathbrok", "root", "root");

		// step4:create statement
		// statement should be imported from java.sql package
		Statement statement = connect.createStatement();

		// Execute query to fetch data
		ResultSet result = statement.executeQuery("select * from students;");

		while (result.next()) {
			System.out.println(result.getInt(1) + "\t" + result.getString(2));
		}

		connect.close();

	}

}
