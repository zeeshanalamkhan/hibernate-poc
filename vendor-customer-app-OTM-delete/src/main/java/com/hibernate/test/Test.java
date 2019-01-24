package com.hibernate.test;

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

		Vendor v = (Vendor) ss.get(Vendor.class, new Integer(1001));
		//System.out.println("Vendor-Name: "+v.getVendorName()+"\nVendor-ID: "+v.getVendorId());
		ss.delete(v);
		tx.commit();
		ss.close();
		sf.close();
	}

}
