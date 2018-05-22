package com.niit.EmployeeDemo.EmpModel;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MyEmployee")


public class Employee {

@Id
private int empid;

private String empname;

private String roll;

private String qualification;

private String mobileno;


public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname(String string) {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getRoll() {
	return roll;
}
public void setRoll(String roll) {
	this.roll = roll;
}

public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}


}
