package com.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();

		Transaction tx = ss.beginTransaction();
		
		/*Accounts acc = (Accounts) ss.get(Accounts.class, new Integer(1001));
		System.out.println(acc);*/

		/*Account acc = (Account) ss.get(Account.class, new Integer(65536));
		System.out.println(acc);*/
		
		Query qry = ss.createQuery(("insert into Account(accNumber,name, balance)"
				+ "select a.id, a.name, a.price from Accounts a where a.id=?0"));
		qry.setParameter(0, 1002);
		int count = qry.executeUpdate();
		if(count>0){
			System.out.println("Record updates successfully...");
		}else{
			System.out.println("Record could not be updated...");
		}
		tx.commit();
		ss.close();
		factory.close();
	}

}
