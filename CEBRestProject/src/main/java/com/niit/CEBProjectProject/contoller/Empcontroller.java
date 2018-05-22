package com.niit.CEBProjectProject.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.EmployeeDemo.EmpModel.Employee;
import com.niit.EmployeeDemo.EmpService.EmpserviceInt;


@RestController
@RequestMapping("/api/employee")
//@CrossOrigin(origins = "http://localhost:4200")

public class Empcontroller {

	@Autowired
	private EmpserviceInt employeeService;

	

	@GetMapping
	public ResponseEntity<List<Employee>> listAllEmployees()
	{
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployeeDetails(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{emp_id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("emp_id") int emp_id) {
		
		if(employeeService.getEmployeebyId(emp_id)!=null) {
			return new ResponseEntity<Employee>(employeeService.getEmployeebyId(emp_id), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND); 
	}
	
	@DeleteMapping("/{emp_id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("emp_id") int emp_id) {
		
		if(employeeService.getEmployeebyId(emp_id)!=null) {
			employeeService.deleteEmployeeService(emp_id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
	}
	
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		
		
			employeeService.addEmployeeService(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@PutMapping
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
		
		if(employeeService.getEmployeebyId(employee.getEmpid())!=null) {
			employeeService.updateEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}


}
}
