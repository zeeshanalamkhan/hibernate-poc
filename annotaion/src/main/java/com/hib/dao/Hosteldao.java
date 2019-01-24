package com.hib.dao;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Hostel;

public class Hosteldao {
public boolean insert(Hostel hstl){
	boolean isInserted = false;
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session hs = sf.openSession();
	Transaction tx = hs.beginTransaction();
	Serializable id = hs.save(hstl);
	isInserted = (id!=null)?true:false;
	tx.commit();
	hs.close();
	sf.close();
	return isInserted;
}
	

}
