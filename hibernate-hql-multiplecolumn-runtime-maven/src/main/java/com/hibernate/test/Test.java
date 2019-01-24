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
		
		/*Query qry = ss.createQuery("select a.name, a.balance from Account a where a.accNumber=:id");
		qry.setParameter("id", 1);*/
		Query qry = ss.createQuery("select a.name, a.balance from Account a where a.accNumber=?0");
		qry.setParameter(0, 1);
		List l = qry.list();
		Iterator it = l.iterator();
		while(it.hasNext()){
			Object[] o = (Object[])it.next();
			System.out.println("Name: "+o[0]+"\t Balance: "+o[1]+"\n");
		}
		ss.close();
		factory.close();
	}

}
