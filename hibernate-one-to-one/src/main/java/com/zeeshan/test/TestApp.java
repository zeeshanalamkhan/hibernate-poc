package com.zeeshan.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeeshan.entity.Address;
import com.zeeshan.entity.Student;
import com.zeeshan.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		Session s = HibernateUtil.getSession();

		Student s1 = new Student();
		s1.setStdId(1001);
		s1.setStdName("ZAHEER KHAN");

		Address a1 = new Address();
		a1.setCity("HBD");
		a1.setState("TS");
		a1.setS(s1);

		Transaction tx = s.beginTransaction();
		Integer id = (Integer) s.save(a1);
		tx.commit();
		System.out.println("ID: " + id);
		s.close();
	}
}
