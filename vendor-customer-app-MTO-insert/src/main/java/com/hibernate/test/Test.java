package com.hibernate.test;

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
		v.setVendorId(1003);
		v.setVendorName("Flip-G");

		Customer c1 = new Customer();
		c1.setCustomerId(3001);
		c1.setCustomerName("Amcat");
		c1.setParentObjects(v);

		Customer c2 = new Customer();
		c2.setCustomerId(3002);
		c2.setCustomerName("Sucat");
		c2.setParentObjects(v);

		Customer c3 = new Customer();
		c3.setCustomerId(3003);
		c3.setCustomerName("Ducat");
		c3.setParentObjects(v);


		ss.save(c1);
		ss.save(c2);
		ss.save(c3);
		
		
		tx.commit();
		ss.close();
		sf.close();
	}

}
