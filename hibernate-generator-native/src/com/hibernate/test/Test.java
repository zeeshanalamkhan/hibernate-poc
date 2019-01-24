package com.hibernate.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Account;

public class Test {

	public static void main(String[] args) throws Exception {
		Account ac = new Account();
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();
		//ac.setAccNumber(1001);
		ac.setName("Jamshed Khan");
		ac.setBalance(563.36);
		Transaction tx = ss.beginTransaction();

		ss.save(ac);

		System.out.println("Object Has been saved");

		tx.commit();
		ss.close();
		factory.close();
	}

}
