package com.custom.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.custom.entities.Order;

public class OrderDao {
	public boolean insert(Order entity){
		boolean isInserted=false;
		Configuration cfg =  new Configuration().configure();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session hs = sessionFactory.openSession();
		Transaction tx = hs.beginTransaction();
		
		Serializable id = hs.save(entity);
		if(id != null){
			isInserted = true;
		}
		tx.commit();
		hs.close();
		sessionFactory.close();
		return isInserted;
	}
}
