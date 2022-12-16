package spring_bean_life_cycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/esnew";
	private String userName = "root";
	private String password = "msp123";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		//load driver
		Class.forName(driver);
		
		// get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
		// execute query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM esnew.hostelstudentinfo");
		while(rs.next()) {
			int studentId = rs.getInt(1);
			String stdentName = rs.getString(2);
			int hostelFees = rs.getInt(3);
			String footType = rs.getString(4);
			
			System.out.println(studentId+" "+stdentName+" "+hostelFees+" "+footType);
		}
	}

}
