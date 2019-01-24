package com.hib.test;

import com.hib.empdao.EmployeeDao;
import com.hib.entities.Employee;

public class TestEmployee {
	public static void main(String[] args){
		boolean isInserted;
		Employee e1 = new Employee();
		e1.setEmpName("Unzur");
		e1.setJob("Wipro");
		e1.setSalary(305942.555);
		e1.setAddress("Okhala");
		EmployeeDao dao = new EmployeeDao();
		isInserted = dao.insert(e1);
		System.out.println("Record inserted Successsfully: "+isInserted);
	}
}
