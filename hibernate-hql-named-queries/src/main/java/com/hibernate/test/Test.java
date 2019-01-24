package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Account;

public class Test {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		// Query qry = ss.getNamedQuery("query1");
		Query qry = ss.getNamedQuery("query2");
		qry.setParameter(0, new Integer(1001));
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			// Account a = (Account) it.next();
			Object[] o = (Object[]) it.next();
			System.out.println("Account Number: " + o[0] + "\t Name: " + o[1] + "\t Balance: " + o[2]);
			//System.out.println(a);
		}
		ss.close();
		sf.close();
	}
}
