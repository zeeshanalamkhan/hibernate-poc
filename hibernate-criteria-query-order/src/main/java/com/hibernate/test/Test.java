package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hibernate.domain.Product;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Criteria crit = ss.createCriteria(Product.class);
		Criterion c1 = Restrictions.gt("price", new Double(500));
		crit.add(c1);
		/*crit.addOrder(Order.asc("price"));*/
		crit.addOrder(Order.desc("productId"));
		List l = crit.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Product p = (Product) it.next();
			System.out.println("\n"+p);
		}
		ss.close();
		sf.close();
	}
}
