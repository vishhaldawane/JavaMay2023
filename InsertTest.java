import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 //java.beans.Statement

public class InsertTest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the Driver ....");
					//vendor.    protocol.drivarName
				    //oracle.    jdbc.    OracleDriver
					//org.hsqldb.jdbc.    JDBCDriver
			
			//DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			
			System.out.println("Driver loaded....");
			
			System.out.println("Trying to connect to the DB");
			//Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:"
							+ "@localhost:1521:XE","scott","tiger");
			System.out.println("Connected to the DB :"+conn);
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPT VALUES (?,?,?)");
			pst.setInt(1, 50);
			pst.setString(2, "DEV");
			pst.setString(3, "BELAPUR");
			
			System.out.println("PreparedStatement created....");
			
			int rows = pst.executeUpdate();
			System.out.println(rows + " rows inserted...");
			
			System.out.println("Trying to close the DB connection....");
			pst.close();
			conn.close();
			System.out.println("Disconnected from the DB");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
