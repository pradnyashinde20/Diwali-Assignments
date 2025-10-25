package com.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao edao;
	public EmployeeServiceImpl()
	{
		edao=new EmployeeDaoImpl();
	}
	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empname: ");
		String nm=sc.next();
		System.out.println("enter the empid: ");
		int id=sc.nextInt();
		System.out.println("enter the emprole: ");
		String role=sc.next();
		Employee e=new Employee(nm,id,role);
		return edao.save(e);
	}
	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.showAll();
	}
	@Override
	public boolean removeEmp(int id) {
		// TODO Auto-generated method stub
		return edao.removeAll(id);
	}
	@Override
	public List<Employee> findByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findByName(nm);
	}
	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		return edao.sortById();
	}
	@Override
	public void writeToFile(String string) {
		// TODO Auto-generated method stub
		edao.writeFile(string);
	}
	@Override
	public void readFile(String string) {
		// TODO Auto-generated method stub
		edao.readFile(string);
	}
	

}
