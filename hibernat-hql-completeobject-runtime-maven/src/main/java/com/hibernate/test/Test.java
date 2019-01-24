package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Account;

public class Test {

	public static void main(String[] args) throws Exception {
		Account ac = new Account();
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();

		/*Query qry = ss.createQuery("from Account p where p.accNumber=:pid");
		qry.setParameter("pid", 32768);*/
		Query qry = ss.createQuery("from Account p where p.accNumber=?0");
		qry.setParameter(0, 32768);
		List l = qry.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Account p = (Account) it.next();
			System.out.println(p);
		}

		ss.close();
		factory.close();
	}

}
