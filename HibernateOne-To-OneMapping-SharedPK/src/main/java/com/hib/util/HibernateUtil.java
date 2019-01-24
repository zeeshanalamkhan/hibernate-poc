package com.hib.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private HibernateUtil() {

	}

	private static SessionFactory sf = null;

	public static Session getSession() {
		if (sf == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();

		}

		return sf.openSession();
	}

	public static void closeSf() {
		sf.close();
	}

}
