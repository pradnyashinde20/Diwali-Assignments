package com.service;

import java.util.List;
import java.util.Set;

import com.bean.Employee;

public interface EmployeeService {

	boolean addEmployee();

	List<Employee> displayAll();

	boolean removeEmp(int id);

	List<Employee> findByName(String nm);

	List<Employee> sortById();

	void writeToFile(String string);

	void readFile(String string);

	

}
