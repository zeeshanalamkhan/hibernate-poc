package com.mapping.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.domain.Payment;

public class SaveTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Payment p = new Payment();
		p.setAmount(852.36);
		p.setPaymentId(1003);
		session.save(p);

		/*
		 * CreditCard cc = new CreditCard(); cc.setCreditCardType("MasteCard");
		 * cc.setAmount(5236.33); cc.setPaymentId(1001); Cheque cq = new
		 * Cheque(); cq.setPaymentId(1002); cq.setAmount(962.36);
		 * cq.setChequeType("BEARER");
		 * 
		 * session.save(cc); session.save(cq);
		 */
		tx.commit();
		session.close();
		sf.close();

	}
}
