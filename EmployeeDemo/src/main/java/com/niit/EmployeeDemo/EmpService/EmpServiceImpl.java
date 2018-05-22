package com.niit.EmployeeDemo.EmpService;


import com.niit.EmployeeDemo.EmpDao.EmpdaoInt;
import com.niit.EmployeeDemo.EmpModel.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpserviceInt {
	
	@Autowired
	private EmpdaoInt mydao;	
	
	public  Employee getEmployeebyId(int emp_id) {
		return (Employee) mydao.getEmployeebyId(emp_id);
	}
	
		public List<Employee> getAllEmployeeDetails() {
		return (List<Employee>) mydao.getAllEmployeeDetails();
	}

	public boolean addEmployeeService(Employee emp) {
		// TODO Auto-generated method stub
		return (mydao.addEmployee(emp));
	}

	public boolean deleteEmployeeService(int emp_id) {
		// TODO Auto-generated method stub
		return (mydao.deleteEmployee(emp_id));
	}

	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return (mydao.updateEmployee(emp));
	}



}
