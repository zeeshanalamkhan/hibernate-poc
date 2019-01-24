package com.hibernate.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Car;

public class CarDAO {

	public boolean insert(Car c) {
		Serializable id = null;
		boolean isInserted = false;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			Transaction tx = hs.beginTransaction();
			id = hs.save(c);
			if (id != null) {
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

	public boolean updateCar(Car c) {

		boolean isUpdated = false;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			 Transaction tx = hs.beginTransaction();
			System.out.println(c);
			hs.saveOrUpdate(c);
			isUpdated = true;

			 tx.commit();
			hs.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUpdated;
	}
}
