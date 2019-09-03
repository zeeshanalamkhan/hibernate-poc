package com.zeeshan.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory factory = null;
	private static Configuration cfg = null;

	public static Session getSession() {

		if (factory == null) {
			cfg = new Configuration().configure("com/zeeshan/cfgs/hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();
		}
		return factory.openSession();
	}
}
