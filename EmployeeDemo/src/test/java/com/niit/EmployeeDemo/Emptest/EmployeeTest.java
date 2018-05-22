package com.niit.EmployeeDemo.Emptest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.EmployeeDemo.EmpConfig.ConfigEmp;
import com.niit.EmployeeDemo.EmpModel.Employee;
import com.niit.EmployeeDemo.EmpService.EmpserviceInt;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ConfigEmp.class) 


public class EmployeeTest {
	


	@Autowired
	private EmpserviceInt empserve;
	
	Employee employee;
	
	@Before
	public void setUp() throws Exception 
	{
		employee=new Employee();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	/*@Test
	public void AddEmployee()
	{
		employee.setEmpid(102);
	  	employee.setEmpname("Ram");
	  	employee.setRoll("Trainer");
	  	employee.setQualification("MCA");
	  	employee.setMobileno("8786543");
	  	
	  //	assertEquals("Success",true,empServices.addservice(emp));
	  	assertEquals("Success",true,empserve.addEmployeeService(employee));
	}*/
	

//	@Test
//	public void Adddata() 
//	{
//		employee.setEmpid(1001);
//		employee.setEmpname("Ramkumar");
//		employee.setRoll("Trainer");
//		employee.setQualification("BE");
//		employee.setMobileno("9878767874");
//
//	assertEquals("Success",true,empserve.addEmployeeService(employee));
//	}
	
/*
	@Test
	public void deleteData()
	{
		assertEquals("not found",true,empserve.deleteEmployeeService(105));
	}
	*/
	
	
	/*
	@Test
	public void updateEmployee() 
	{
		employee=empserve.getEmployeebyId(107);
		employee.setEmpname("MEENAA");
		
		assertEquals("Successfully Updated",true, empserve.updateEmployee(employee));
	}
	*/
	
	@Test
	public void getAllEmployeeTest()
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = empserve.getAllEmployeeDetails();
		
		System.out.println("Size of employeeList = "+employeeList);
		assertEquals("Success", true, employeeList.size()!=0);
		 
		}
		


}
