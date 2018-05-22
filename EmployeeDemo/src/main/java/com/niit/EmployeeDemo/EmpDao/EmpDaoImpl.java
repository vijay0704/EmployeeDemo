package com.niit.EmployeeDemo.EmpDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

import com.niit.EmployeeDemo.EmpModel.Employee;

@Repository("mydao")
@Transactional

public class EmpDaoImpl implements EmpdaoInt {
	@Autowired
    private SessionFactory sessionFact;
	
	public boolean addEmployee(Employee emp) {
		
		sessionFact.getCurrentSession().save(emp);
		return true;
	}

	public boolean updateEmployee(Employee emp) {
		sessionFact.getCurrentSession().update(emp);
		return true;
	}
	
	public boolean deleteEmployee(int emp_id) 
	{
		
		Employee employee=getEmployeebyId(emp_id);
		if(employee!=null)
		{
			sessionFact.getCurrentSession().delete(employee);
				return true;
		}
		else
			return false;
	}

	public Employee getEmployeebyId (int emp_id) 
	{
	
				return (Employee) sessionFact.getCurrentSession().createQuery("from Employee where empid="+emp_id).uniqueResult();
		
	}
	
	public java.util.List<Employee>getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return (java.util.List<Employee>) sessionFact.getCurrentSession().createCriteria(Employee.class).list();
	}
	
	
}	
	