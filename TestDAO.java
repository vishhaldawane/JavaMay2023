import java.util.Set;

import dao.DepartmentDAO;
import dao.DepartmentDAOImpl;
import pojo.Department;

public class TestDAO {
	public static void main(String[] args) {
		DepartmentDAO deptDAO = new DepartmentDAOImpl();
		Set<Department> deptSet = deptDAO.selectAllDepartments();
		
		for (Department dept : deptSet) {
			System.out.println("DEPNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME : "+dept.getDepartmentName());
			System.out.println("LOC   : "+dept.getDepartmentLocation());
		}
		
	}
}
