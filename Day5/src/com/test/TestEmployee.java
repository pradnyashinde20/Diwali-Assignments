package com.test;

import java.util.List;
import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		service.readFile("empdata.txt");
		int choice=0;
do {
	System.out.println("1.Add employee to list\n2. remove employee list");
	System.out.println("3.show all employee\n4.show all employee in sorted order\n5.find employee with empname");
System.out.println("6.save all employee into file\n7.quit\n choice>>");
choice=sc.nextInt();
switch(choice)
{
case 1->{
	boolean status=service.addEmployee();
	if(status)
	{
		System.out.println("added successfully");
	}
	else {
		System.out.println("not added");
	}
}
case 2->{
	System.out.println("enter the id:");
	int id=sc.nextInt();
	boolean status=service.removeEmp(id);
	if(status)
	{
		System.out.println("deleted successfully");
	}
	else {
		System.out.println("not found");
	}
}
case 3->{
	List<Employee>lt=service.displayAll();
	lt.forEach(System.out::println);
}
case 4->{
	List<Employee>est=service.sortById();
	est.forEach(System.out::println);
}
case 5->{
	System.out.println("enter the name:");
	String nm=sc.next();
	List<Employee>lt=service.findByName(nm);
	lt.forEach(System.out::println);
}
case 6->{
	service.writeToFile("empdata1.txt");
}
case 7->{
	sc.close();
	System.out.println("Thank You For visting visit again!!");
}
default->{
	System.out.println("wrong choice");
}
}
}while(choice!=7);
	}

}
