package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Customer;
import com.hibernate.domain.Vendor;

@SuppressWarnings({ "deprecation", "rawtypes" })
public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		
		/*Customer c = (Customer)ss.get(Customer.class, new Integer(3001));
		
		Query qry = ss.createQuery("from Customer c");
		List l = qry.list();
		Iterator it = l.iterator();
		while(it.hasNext()){
			Customer c=(Customer)it.next();
			System.out.println(c);
		}
		System.out.println(c);*/
		
		Object o = ss.get(Customer.class, new Integer(3001));
		Customer c = (Customer)o;
		System.out.println(c.getCustomerName());
		Vendor v=c.getParentObjects();
		System.out.println(v.getVendorName());
		
		tx.commit();
		ss.close();
		sf.close();
	}

}
