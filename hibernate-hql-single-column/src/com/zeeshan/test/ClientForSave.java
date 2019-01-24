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

		Query qry = session.createQuery("select p.productId from Product p");
		List list = qry.list();
		Iterator it = list.iterator();
		System.out.println("SIZE: "+list.size());
		while(it.hasNext()){
			Integer id = (Integer)it.next();
			System.out.println("ID: "+id+"\n");
		}
		session.close();
		sf.close();

	}
}
