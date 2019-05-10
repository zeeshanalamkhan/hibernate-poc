package com.zeeshan.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeeshan.domain.Emp;
import com.zeeshan.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Emp emp1 = new Emp();
		emp1.setName("Zameer");
		emp1.setSalary(1200);
		// String strDate = "15-08-1992";
		emp1.setDob("15-08-1992");
		Transaction tx = session.beginTransaction();
		String id = (String) session.save(emp1);
		tx.commit();
		System.out.println("ID ----> " + id);
		session.close();
	}
}
