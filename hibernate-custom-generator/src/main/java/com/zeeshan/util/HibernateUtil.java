package com.zeeshan.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	static int x = 0;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			System.out.println("HibernateUtil.getSession() ----- " + ++x);
			Configuration cfg = new Configuration().configure("com/zeeshan/cfgs/hibernate.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
