package com.bean;

public class Employee {
String empName;
int empId;
String empRole;
public Employee() {
	super();
	
}
public Employee(String empName, int empId, String empRole) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empRole = empRole;
}

public Employee(int empId) {
	super();
	this.empId = empId;
}
@Override
public boolean equals(Object obj) {
	Employee other = (Employee) obj;
	return empId == other.empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpRole() {
	return empRole;
}
public void setEmpRole(String empRole) {
	this.empRole = empRole;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empRole=" + empRole + "]";
}





}
