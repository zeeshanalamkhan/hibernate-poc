package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Vendor;

public class Test {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		Query qry = ss.createQuery("from Vendor v");
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Vendor v = (Vendor) it.next();
			// System.out.println(v.getVendorName() + "\t" + v.getVendorId());
			ss.delete(v);
		}
		System.out.println("All Vendor objects hasben deleted");
		tx.commit();
		ss.close();
		sf.close();
	}

}
