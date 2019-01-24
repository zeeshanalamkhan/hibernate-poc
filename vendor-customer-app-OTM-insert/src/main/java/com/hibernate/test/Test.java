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

		Vendor v1 = new Vendor();
		v1.setVendorId(111);
		v1.setVendorName("GeeksForGeeks");
		
		Customer c1 = new Customer();
		c1.setCustomerId(222);
		c1.setCustomerName("Google");
		c1.setParentObjects(v1);
	
		Customer c2 = new Customer();
		c2.setCustomerId(333);
		c2.setCustomerName("HiTech");
		c2.setParentObjects(v1);
		
		Customer c3 = new Customer();
		c1.setCustomerId(444);
		c1.setCustomerName("Yahoo");
		c1.setParentObjects(v1);
		
		ss.save(c1);
		ss.save(c2);
		ss.save(c3);
		
		tx.commit();
		ss.close();
		sf.close();
	}

}
