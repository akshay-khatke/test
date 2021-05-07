package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	
	public static Connection getconnection() {
		
		Connection con=null;
		try {

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","2594akki");
		} catch (SQLException  e) {
			e.printStackTrace();
		}
	
		return con;

	}
}
