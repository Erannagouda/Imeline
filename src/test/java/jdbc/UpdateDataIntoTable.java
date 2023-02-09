package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class UpdateDataIntoTable {

	public static void main(String[] args) throws SQLException {

		Driver dbdriver = new Driver();

		DriverManager.registerDriver(dbdriver);

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/lathbrok", "root", "root");

		Statement statement = connect.createStatement();

		int result = statement.executeUpdate("insert into students(id,name,address)values(101,'Abc','Bangalore');");

		if (result == 1) {
			System.out.println("DB updated successfully");
		} else {
			System.out.println("DB not updated");
		}
		connect.close();

	}

}
