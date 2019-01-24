package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Customer;

@SuppressWarnings({ })
public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		Customer c= (Customer)ss.get(Customer.class, new Integer(3001));
		ss.delete(c);
		System.out.println("********************************************");
		tx.commit();
		Customer c1= (Customer)ss.get(Customer.class, new Integer(3001));
		System.out.println(c1);
		ss.close();
		sf.close();
	}

}
