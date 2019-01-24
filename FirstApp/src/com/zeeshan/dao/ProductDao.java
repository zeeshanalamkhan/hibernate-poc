package com.zeeshan.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zeeshan.entities.Product;

public class ProductDao {
	public boolean insert(Product entity){
		boolean isInserted = false;
		try{
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			Transaction tx = hs.beginTransaction();
			Serializable ser = hs.save(entity);
			if(ser != null){
				isInserted = true;
			}
			tx.commit();
			hs.close();
			sf.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		return isInserted;
	}
}
