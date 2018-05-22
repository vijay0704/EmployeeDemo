package com.niit.EmployeeDemo.EmpService;

import java.util.List;


import com.niit.EmployeeDemo.EmpModel.Employee;

public interface EmpserviceInt {


	public boolean addEmployeeService(Employee emp);
	
	public boolean deleteEmployeeService(int emp_id);
	
	public  Employee getEmployeebyId(int emp_id) ;
		
	
	public boolean updateEmployee(Employee emp);
	
	public List<Employee>getAllEmployeeDetails();

}
