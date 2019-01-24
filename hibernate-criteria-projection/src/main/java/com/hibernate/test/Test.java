package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.domain.Product;

public class Test {
	@SuppressWarnings("deprication")
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Criteria crit = ss.createCriteria(Product.class);
		// Criterion c1 = Restrictions.between("productId", 1001, 1004);
		// Criterion c1 = Restrictions.between("productId", 1001, 1002);
		Criterion c1 = Restrictions.between("productId", 1001, 1002);
		crit.add(c1);
		crit.setProjection(Projections.property("name"));
		List l = crit.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println("Name: " + name);
		}
		ss.close();
		sf.close();
	}
}
