package com.ihm.tph.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ihm.tph.entities.SavingAccount;

public class AccountDao {
	public boolean insert(SavingAccount sa){
		boolean isInserted = false;
		try{
			Configuration cfg  = new Configuration().configure("com/ihm/tph/cfgs/hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			Session hs = sf.openSession();
			Transaction tx = hs.beginTransaction();
			Serializable sz = hs.save(sa);
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
