package com.hibernate.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Product;

public class ProductDAO {

	public boolean insert(Product p) {
		boolean isInserted = false;
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			Transaction tx = hs.beginTransaction();
			Serializable ser = hs.save(p);
			if (ser != null) {
				isInserted = true;
			}
			tx.commit();
			hs.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isInserted;
	}

}
