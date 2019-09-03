package com.zeeshan.test;

import org.hibernate.Session;

import com.zeeshan.entity.Address;
import com.zeeshan.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		Session s = HibernateUtil.getSession();

		/*
		 * Student s1 = new Student(); s1.setStdId(1001);
		 * s1.setStdName("ZAHEER KHAN");
		 * 
		 * Address a1 = new Address(); a1.setAddId(2001); a1.setCity("HBD");
		 * a1.setState("TS"); s1.setA(a1); a1.setS(s1);
		 * 
		 * Transaction tx = s.beginTransaction(); Integer id = (Integer)
		 * s.save(a1); tx.commit();
		 */
		Address a = (Address) s.get(Address.class, new Integer(1001));
		System.out.println(a.getAddId());
		s.close();
	}
}
