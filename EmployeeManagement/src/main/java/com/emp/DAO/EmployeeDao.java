package com.emp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emp.DTO.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private EntityTransaction  entityTransaction;
	
	public void save(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void delete(Employee employee)
	{
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
	public Employee getEmployeeById(int id)
	{
		return entityManager.find(Employee.class, id);
	}
	public void update(Employee employee)
	{
		Employee emp=getEmployeeById(employee.getId());
		if(emp!=null)
		{
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			
		}
	}
	
	public List<Employee> alldetails()
	{
		Query q=entityManager.createQuery("select e from Employee e");
		return q.getResultList();
	}
	

}
