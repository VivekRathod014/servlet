package com.jsp.user.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.user.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vivek");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Employee employee = new Employee();
	
	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	
	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if(employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
	public Employee getEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}
	
	public boolean updateEmployee(int id, String email) {
		Employee employee = entityManager.find(Employee.class, id);
		employee.setEmail(email);
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return true;
	}
	
	public List<Employee> getAll() {
		String sql = "select e from Employee e";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

}
