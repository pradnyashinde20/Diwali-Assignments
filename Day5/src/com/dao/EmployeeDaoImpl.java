package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	List<Employee>li=new ArrayList<>();

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		li.add(e);
		return true;
	}

	@Override
	public List<Employee> showAll() {
		// TODO Auto-generated method stub
		return li;
	}

	@Override
	public boolean removeAll(int id) {
		// TODO Auto-generated method stub
		return li.remove(new Employee(id));
	}

	@Override
	public List<Employee> findByName(String nm) {
		// TODO Auto-generated method stub
		List<Employee>el=li.stream().filter(e->e.getEmpName().equals(nm)).collect(Collectors.toList());
		if(li.size()>0)
		{
			return el;
		}
		return null;
	}

	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		List<Employee>lst=new ArrayList<>();
		for(Employee e:li)
		{
			lst.add(e);
		}
		Comparator<Employee>c=(o1,o2)->{
		
		return o1.getEmpId()-o2.getEmpId();
		
		};
		lst.sort(c);
		return lst;
	}

	@Override
	public void writeFile(String string) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(string)))
		{
			for(Employee e:li)
			{
				os.writeObject(e);
			}
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void readFile(String string) {
		// TODO Auto-generated method stub
		File f=new File(string);
		if(f.exists())
		{
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(string));){
				while(true)
				{
					Employee e=(Employee)ois.readObject();
					li.add(e);
				}
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	

}
