package com.hib.test;

import com.hib.dao.EmployeeDao;
import com.hib.entities.EmployeeEntity;

public class testMySQL {
	public static void main(String[] args) {
		boolean isInserted;
		EmployeeEntity emp  =new EmployeeEntity();
		emp.seteName("ZAHEER");
		emp.setJob("MANAGER");
		emp.setSal(8275.36);
		EmployeeDao dao = new EmployeeDao();
		isInserted = dao.insert(emp);
		System.out.println("is Record Inserted Successfully!?: "+isInserted);
	}
}
