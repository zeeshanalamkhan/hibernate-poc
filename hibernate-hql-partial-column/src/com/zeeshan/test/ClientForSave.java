package com.zeeshan.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		Transaction tx = session.beginTransaction();

		Query qry = session.createQuery("select p.productId, p.proName from Product p");
		List list = qry.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object[] o = (Object[]) it.next();

			System.out.println("ProductId: " + o[0] + " ProductName: " + o[1]);
		}
		session.close();
		sf.close();

	}
}
