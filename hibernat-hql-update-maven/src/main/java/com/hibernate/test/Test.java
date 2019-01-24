package com.hibernate.test;

import org.hibernate.Query;
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
		Transaction tx = ss.beginTransaction();
		
		/*Query qry = ss.createQuery("UPDATE Account a SET a.name=:name WHERE a.accNumber=:pid");
		qry.setParameter("name", "Zaheer");
		qry.setParameter("pid", 1001);*/
		
		Query qry = ss.createQuery("UPDATE Account a SET a.name=?1 WHERE a.accNumber=?2");
		qry.setParameter(1, "Zeeshan");
		qry.setParameter(2, 1001);

		int count = qry.executeUpdate();

		if (count > 0) {
			System.out.println("Record hasbeen updated successfully...");
		} else {
			System.out.println("Record has not been updated");
		}
		tx.commit();
		ss.close();
		factory.close();
	}

}
