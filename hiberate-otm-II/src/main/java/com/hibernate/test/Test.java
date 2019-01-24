package com.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.domain.Author;
import com.hibernate.domain.Book;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("com/hibernate/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

		Author auth = new Author();
		auth.setId(1111);
		auth.setName("Timothy");
		auth.setAddress("London");
		
		Book b = new Book();
		b.setId(1001);
		b.setTitle("Hibernate");
		b.setIsbn("HIB1234");

		Book b1 = new Book();
		b1.setId(1002);
		b1.setTitle("Spring");
		b1.setIsbn("SPR1234");

		Book b2 = new Book();
		b2.setId(1003);
		b2.setTitle("WebServices");
		b2.setIsbn("WebS1234");

		Set<Book> s = new HashSet<>();
		s.add(b);
		s.add(b1);
		s.add(b2);

		
		auth.setBooks(s);

		ss.save(auth);

		tx.commit();
		ss.close();
		factory.close();

	}

}
