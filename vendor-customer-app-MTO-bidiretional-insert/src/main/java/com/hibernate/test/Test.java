package com.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Customer;
import com.hibernate.domain.Vendor;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		Vendor v = new Vendor();
		v.setVendorId(1001);
		v.setVendorName("Netflix");

		Customer c1 = new Customer();
		c1.setCustomerId(1111);
		c1.setCustomerName("Sony-Sub");

		Customer c2 = new Customer();
		c2.setCustomerId(1112);
		c2.setCustomerName("Sony-Ent.");

		Customer c3 = new Customer();
		c3.setCustomerId(1113);
		c3.setCustomerName("Colours");

		Set<Customer> s = new HashSet<>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		
		v.setChildren(s);
		ss.save(v);
		tx.commit();
		ss.close();
		sf.close();
	}

}
