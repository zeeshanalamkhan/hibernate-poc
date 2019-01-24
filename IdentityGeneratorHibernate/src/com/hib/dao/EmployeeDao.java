package com.hib.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entities.EmployeeEntity;

public class EmployeeDao implements Serializable {
	public boolean insert(EmployeeEntity emp){
		boolean isInserted = false;
		try{
			Configuration cfg  = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			Transaction tx = hs.beginTransaction();
			Serializable sz = hs.save(emp);
			if(sz!=null){
				isInserted = true;
			}
			tx.commit();
			hs.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isInserted;
	}
}
