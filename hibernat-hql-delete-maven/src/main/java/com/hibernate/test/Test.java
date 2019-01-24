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
		/*Query qry = ss.createQuery("delete from Account a where a.accNumber=:pid");
		qry.setParameter("pid", 1);*/
		
		/*Query qry = ss.createQuery("delete from Account a where a.accNumber=:pid or a.name='Sam'");
		qry.setParameter("pid", 1001);*/
		
		Query qry = ss.createQuery("delete from Account a where a.accNumber=?0 or a.name=?1");
		qry.setParameter(0, 1001);
		qry.setParameter(1, "Zeeshan");
		
		int count = qry.executeUpdate();
		if (count > 0) {
			System.out.println("Data hasbeen deleted...."+count);
		} else {
			System.out.println("Data has not been deleted"+count);
		}
		tx.commit();
		ss.close();
		factory.close();
	}

}
