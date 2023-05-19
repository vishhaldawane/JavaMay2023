package dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import pojo.Department;

public interface DepartmentDAO { //POJI
	//CRUD functions for Department pojo here
	Department selectDepartmentByDeptNo(int deptno);
	HashSet<Department> selectAllDepartments();
	void insertDepartment(Department newDept);
	void updateDepartment(Department newDept);
	void deleteDepartmentByDeptno(int deptno);
}
