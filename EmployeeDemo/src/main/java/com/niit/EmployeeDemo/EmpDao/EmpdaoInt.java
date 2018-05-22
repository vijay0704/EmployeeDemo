package com.niit.EmployeeDemo.EmpDao;

import java.util.List;


import com.niit.EmployeeDemo.EmpModel.Employee;

public interface EmpdaoInt {

	public boolean addEmployee(Employee emp);
	public boolean deleteEmployee(int empid);
	public boolean updateEmployee(Employee emp);
	public List<Employee>getAllEmployeeDetails();	
	public Employee getEmployeebyId(int empid);
	

}
