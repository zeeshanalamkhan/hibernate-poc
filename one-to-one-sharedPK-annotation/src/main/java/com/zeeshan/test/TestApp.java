package com.zeeshan.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.zeeshan.pojo.Address;
import com.zeeshan.pojo.Person;

public class TestApp {
	public static void main(String[] args) throws Exception {
		/*
		 * Configuration cfg = new Configuration();
		 * cfg.configure("com/zeeshan/config/hibernate.cfg.xml"); SessionFactory
		 * factory = cfg.buildSessionFactory(); Session ss =
		 * factory.openSession();
		 * 
		 * Transaction tx = ss.beginTransaction();
		 */

		Configuration cfg = new Configuration();
		cfg.configure("com/zeeshan/config/hibernate.cfg.xml");
		StandardServiceRegistryBuilder sr = new StandardServiceRegistryBuilder();
		sr.applySettings(cfg.getProperties()).build();

		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();  

		/*Person p = new Person();
		p.setName("Faizan");
		p.setAge(23);
		p.setEmail("faizan@gmail.com");
		Address address = new Address();
		address.sethNo("F/23-A");
		address.setCity("New Delhi");
		address.setCountry("India");
		address.setState("New Delhi");
		address.setPerson(p);*/

		Person p = new Person();
		p.setName("Faizan");
		p.setAge(23);
		p.setEmail("faizan@gmail.com");
		Address address = new Address();
		address.sethNo("F/23-A");
		address.setCity("New Delhi");
		address.setCountry("India");
		address.setState("New Delhi");
		address.setPerson(p);
		
		Integer id = (Integer) ss.save(p);
		tx.commit();
		System.out.println("ID---->" + id);
		ss.close();
		factory.close();

	}
}
