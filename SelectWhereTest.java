import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 //java.beans.Statement
import java.util.Scanner;

public class SelectWhereTest {
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
			
			
			Scanner scanner1 = new Scanner(System.in);
			
			System.out.println("Enter deptno to search : ");
			int deptnoToFind  = scanner1.nextInt();
				
			Statement st = conn.createStatement();
			System.out.println("Statement created....");
			
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT WHERE DEPTNO="+deptnoToFind);
			System.out.println("Query fired and got the result..");
			
			if(rs.next()) {
				System.out.println("DEPTNO    : "+rs.getInt(1));
				System.out.println("DEPT NAME : "+rs.getString(2));
				System.out.println("DEPT LOC  : "+rs.getString(3));
				System.out.println("-------------------------");
			}else {
				System.out.println("Department NOT found : "+deptnoToFind);
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
