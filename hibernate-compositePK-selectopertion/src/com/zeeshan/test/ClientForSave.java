package com.zeeshan.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zeeshan.hibernate.Product;

class ClientForSave {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		//Transaction tx = session.beginTransaction();
		
		Product p = new Product();
		Product p1 = new Product();
		p.setProductId(1001);
		p.setProName("Stationary");
		/*p.setPrice(22.0);*/
		p1=session.get(Product.class, p);
		System.out.println(p1);
		//tx.commit();
		session.close();
		sf.close();

	}
}
