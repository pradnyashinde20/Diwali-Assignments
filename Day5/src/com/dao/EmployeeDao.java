package com.dao;

import java.util.List;
import java.util.Set;

import com.bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> showAll();

	boolean removeAll(int id);

	List<Employee> findByName(String nm);

	List<Employee> sortById();

	void writeFile(String string);

	void readFile(String string);

	

}
