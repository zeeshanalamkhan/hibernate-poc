package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.domain.Product;

public class UpdateTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Product p = session.load(Product.class, new Integer(1002));
		System.out.println(p);
		p.setProName("Laptop-Charger");
		tx.commit();
		session.close();
		sf.close();
	}
}
