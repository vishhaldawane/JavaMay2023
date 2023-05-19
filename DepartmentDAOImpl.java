package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

import pojo.Department;

public class DepartmentDAOImpl implements DepartmentDAO {
	Connection conn;
	
	public DepartmentDAOImpl() {
		try {
			System.out.println("Trying to load the Driver ....");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver loaded....");
			System.out.println("Trying to connect to the DB");
			conn = DriverManager.getConnection("jdbc:oracle:thin:" + "@localhost:1521:XE", "scott", "tiger");
			System.out.println("Connected to the DB :" + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Department selectDepartmentByDeptNo(int deptno) {
		Department 	deptObj = null;;
		try {
			Statement st = conn.createStatement();
		
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT WHERE DEPTNO="+deptno);
			System.out.println("Query fired and got the result..");
			
			if(rs.next()) {
				deptObj  = new Department();
				//fill it up / populate the values from the rs grid
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentName(rs.getString(2));
				deptObj.setDepartmentLocation(rs.getString(3));
				
			}else {
				System.out.println("Department NOT found : "+deptno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptObj;
	}

	@Override
	public HashSet<Department> selectAllDepartments() {
		Department 	deptObj = null;
		HashSet<Department> 	deptList = new HashSet<Department>();
		
		try {
			Statement st = conn.createStatement();
		
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT");
			System.out.println("Query fired and got the result..");
			
			while(rs.next()) {
				deptObj  = new Department();
				//fill it up / populate the values from the rs grid
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentName(rs.getString(2));
				deptObj.setDepartmentLocation(rs.getString(3));
				deptList.add(deptObj); //push it to the list...
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

	@Override
	public void insertDepartment(Department newDept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDepartment(Department newDept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDepartmentByDeptno(int deptno) {
		// TODO Auto-generated method stub

	}

}
