package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		@SuppressWarnings("rawtypes")
		Query qry = ss.getNamedQuery("query1");
		qry.setParameter(1, new Integer(1007));
		List l = qry.list();
		@SuppressWarnings("rawtypes")
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object[] o = (Object[]) it.next();
			System.out.println("ACCOUNT NUMBER: " + o[0] + "\t NAME: " + o[1] + "\t BALANCE: " + o[2]);
		}
	}
}
