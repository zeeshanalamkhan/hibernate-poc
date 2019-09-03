package com.zeeshan.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeeshan.entity.Customer;
import com.zeeshan.entity.Vendor;
import com.zeeshan.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {

		Session s = HibernateUtil.getSession();

		// insert
		/*
		 * Vendor v = new Vendor(); v.setvId(1001); v.setvName("TATA"); Customer
		 * c1 = new Customer(); c1.setcId(101); c1.setcName("H & R Sons");
		 * Customer c2 = new Customer(); c2.setcId(102);
		 * c2.setcName("Rameez Steels"); Customer c3 = new Customer();
		 * c3.setcId(103); c3.setcName("Javed Almirah"); Set<Customer> s1 = new
		 * HashSet<Customer>(); s1.add(c1); s1.add(c2); s1.add(c3);
		 * v.setCustomers(s1); Transaction tx = s.beginTransaction(); Integer id
		 * = (Integer) s.save(v); tx.commit(); System.out.println("ID---->" +
		 * id);
		 */
		// read
		/*
		 * Vendor v = (Vendor) s.get(Vendor.class, 1001);
		 * System.out.println(v.getvName()); Set<Customer> s1 =
		 * v.getCustomers(); for (Customer c : s1) { System.out.println(c); }
		 */
		// delete
		Transaction tx = s.beginTransaction();
		Vendor v = (Vendor) s.get(Vendor.class, 1001);
		s.delete(v);
		tx.commit();
		System.out.println("delete successfull");
		s.close();
	}
}
