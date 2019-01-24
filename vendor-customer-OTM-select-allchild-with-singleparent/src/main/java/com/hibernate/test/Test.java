package com.hibernate.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
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

		Query qry = ss.createQuery("from Vendor v order by v.vendorId");
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Vendor v = (Vendor) it.next();
			System.out.println("Name: " + v.getVendorName() + " VendorId: " + v.getVendorId());

			Set<Customer> s = v.getChildren();
			Iterator it1 = s.iterator();
			while (it1.hasNext()) {
				Customer c = (Customer) it1.next();
				System.out.println("CustomerId: " + c.getCustomerId() + " CustomerName: " + c.getCustomerName());
			}
		}

		tx.commit();
		ss.close();
		sf.close();
	}

}
