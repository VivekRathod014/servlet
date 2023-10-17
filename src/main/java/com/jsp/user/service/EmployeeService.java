package com.jsp.user.service;

import java.util.List;

import com.jsp.user.dao.EmployeeDao;
import com.jsp.user.dto.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao = new EmployeeDao();
	
	public Employee saveEmployee(Employee employee) {
		if(employee.getName()!= null && employee.getEmail()!= null &&
				employee.getGender()!= null && employee.getSalary()> 0) {
			return employeeDao.saveEmployee(employee);
		}
		return null;
	}
	
	public boolean deleteEmployee(int id) {
	   return employeeDao.deleteEmployee(id);
	}
	
	public boolean updateEmployee(int id, String email) {
		return employeeDao.updateEmployee(id, email);
	}
	
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
	

}
