package com.hib.empdao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entities.Employee;

public class EmployeeDao {
	public boolean insert(Employee e){
		boolean isInserted = false;
		try{
			Configuration cfg = new Configuration();
			cfg.configure("com/hib/cfgs/hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session ss = sf.openSession();
			
			Transaction tx = ss.beginTransaction();
			
			Serializable id = ss.save(e);
			
			if(id != null){
				isInserted = true;
			}
			
			tx.commit();
			ss.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return isInserted;
	}
}
