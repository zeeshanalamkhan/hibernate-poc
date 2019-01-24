package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernate.domain.Product;

public class Test {

	public static void main(String[] args){
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Criteria crit = ss.createCriteria(Product.class);
		Criterion c1 = Restrictions.eq("name", new String("E-Seva"));
		Criterion c2 = Restrictions.ge("price", new Double(753.33)); 
		//crit.add(c1);
		crit.add(c2);
		List l = crit.list();
		Iterator it = l.iterator();
		while(it.hasNext()){
			Product str = (Product)it.next();
			System.out.println(str);
		}
		ss.close();
		sf.close();
	}
	
}
