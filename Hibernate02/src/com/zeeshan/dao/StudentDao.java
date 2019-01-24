package com.zeeshan.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zeeshan.entities.Student;

public class StudentDao {
	public boolean insert(Student std){
		boolean isInserted = false;
		try{
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session hsession = sf.openSession();
			Transaction tx = hsession.beginTransaction();
			Serializable sz = hsession.save(std);
			if(sz!= null){
				isInserted = true;
			}
			tx.commit();
			hsession.close();
			sf.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return isInserted;
	}
}
