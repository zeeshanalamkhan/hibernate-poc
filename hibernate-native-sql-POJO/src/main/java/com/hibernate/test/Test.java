package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
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

		SQLQuery qry = ss.createSQLQuery("select * from accounts").addEntity(Account.class);
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Account a = (Account) it.next();
			System.out.println(a);
			// System.out.println("ACCOUNT NUMBER: " + o[0] + "\t NAME: " + o[1]
			// + "\t BALANCE: " + o[2]);
		}
		ss.close();
		sf.close();
	}
}
