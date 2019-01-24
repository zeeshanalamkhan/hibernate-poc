package com.poc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poc.domain.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/poc/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/*
		 * Employee e = new Employee(); e.setEmpId(new Integer(1001));
		 * e.setEmpName("Rameez"); e.setDept("IT"); session.save(e);
		 */
		
		 Employee e =(Employee) session.get(Employee.class, 1012);
		 e.setDept("JOE");
		 session.update(e);
		 
		/*Employee e = new Employee();
		e.setEmpId(1012);
		e.setEmpName("Jaunpur");
		session.update(e);
		//session.update(e.getEmpId(), "Faheem");*/
		System.out.println("Saved......");
		tx.commit();
		session.close();
		factory.close();
	}
}
