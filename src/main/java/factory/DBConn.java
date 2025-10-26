package factory;
import java.sql.*;

public class DBConn{
	public static Connection getConn() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradecalculator", "root", "");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}