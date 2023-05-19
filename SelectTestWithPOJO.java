import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.Department;
 //java.beans.Statement

public class SelectTestWithPOJO {
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
			
			
						
			Statement st = conn.createStatement();
			System.out.println("Statement created....");
			
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT");
			System.out.println("Query fired and got the result..");
			
			//associate this rs's content to a data type, eg. Department which same as of your DEPT table [ ORM ]
			
			while(rs.next()) {
				
				//create a new bean / blank pojo
				Department deptObj = new Department();
				
				//fill it up / populate the values from the rs grid
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentName(rs.getString(2));
				deptObj.setDepartmentLocation(rs.getString(3));
				
				//extract the bean wherever required
				System.out.println("DEPTNO    : "+deptObj.getDepartmentNumber());
				System.out.println("DEPT NAME : "+deptObj.getDepartmentName());
				System.out.println("DEPT LOC  : "+deptObj.getDepartmentLocation());
				System.out.println("-------------------------");
			}
			
			
			System.out.println("Trying to close the DB connection....");
			rs.close();
			st.close();
			conn.close();
			System.out.println("Disconnected from the DB");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
