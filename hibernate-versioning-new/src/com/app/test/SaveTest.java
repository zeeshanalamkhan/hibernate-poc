package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.domain.Product;

public class SaveTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product();
		p.setProductId(1002);
		p.setProName("Laptop");
		p.setPrice(2586.36);
		session.save(p);
		tx.commit();
		session.close();
		sf.close();

	}
}
