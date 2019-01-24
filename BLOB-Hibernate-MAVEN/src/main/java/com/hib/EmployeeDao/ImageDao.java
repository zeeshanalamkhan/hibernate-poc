package com.hib.EmployeeDao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Employee;

public class ImageDao {
	public boolean insertImage(Employee e){
		boolean isInserted = false;
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Serializable id = ss.save(e);
		isInserted = (id!=null)?true:false;
		tx.commit();
		ss.close();
		sf.close();
		return isInserted;
		
	}
	public void ReadImage(Employee e) throws Exception{
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		e = ss.get(Employee.class, 1);
		FileOutputStream fos = new FileOutputStream("pic.jpg");
		fos.write(e.getEmpPhoto());
		fos.flush();
		fos.close();
		tx.commit();
		ss.close();
		sf.close();
	}
}
