package com.hib.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Logger logger = Logger.getLogger(HibernateUtil.class);

	// Don't remove
	private HibernateUtil() {
		logger.info("HibnerateUtil:Instantiation completed");
	}

	private static SessionFactory sf = null;

	public static SessionFactory getSf() {
		logger.info("SessionFactory-Instantiation started");
		if (sf == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			sf = cfg.buildSessionFactory();
		}
		logger.info("SessionFactory-Instantiation Completed");
		return sf;
	}

	public static void closeSf() {
		if (sf != null) {
			sf.close();
		}
	}

}
