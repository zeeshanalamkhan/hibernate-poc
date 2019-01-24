package com.hib.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hib.entiities.EmpDetails;
import com.hib.entiities.Employee;
import com.hib.util.HibernateUtil;

public class EmpDAO {

	public void insertEmpData() {
		Session hs = HibernateUtil.getSession();
		Transaction tx = hs.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpName("ZEESHAN ALAM KHAN");
		emp.setEmail("zeeshan@gov.in");

		EmpDetails ed = new EmpDetails();
		ed.setFname("ZEESHAN");
		ed.setMname("ALAM");
		ed.setLname("KHAN");

		emp.setEmpDetails(ed);
		ed.setEmp(emp);
		hs.save(emp);

		tx.commit();
		hs.close();
	}

	public void findEmpById(int empId) {
		Session hs = HibernateUtil.getSession();
		Employee emp = hs.get(Employee.class, empId);
		hs.close();
	}
}
