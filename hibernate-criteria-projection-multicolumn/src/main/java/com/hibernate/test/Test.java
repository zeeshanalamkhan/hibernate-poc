package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernate.domain.Product;

public class Test {
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Criteria crit = ss.createCriteria(Product.class);
		Criterion c1 = Restrictions.le("price", new Double(3286.66));
		crit.add(c1);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("name"));
		pl.add(Projections.property("price"));
		crit.setProjection(pl);
		List l = crit.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object[] o = (Object[]) it.next();

			System.out.println("Name: " + o[0] + "\t Price: " + o[1]);
		}
		ss.close();
		sf.close();
	}
}
